package com.streamapi.streamapi;
     import java.util.*;
	import java.util.stream.Collectors;

	public class HospitalDoctorAvailability {

		static class Doctor {
			String name;
			String specialty;
			boolean availableOnWeekend;

			Doctor(String name, String specialty, boolean availableOnWeekend) {
				this.name = name;
				this.specialty = specialty;
				this.availableOnWeekend = availableOnWeekend;
			}

			public String getName() {
				return name;
			}

			public String getSpecialty() {
				return specialty;
			}

			public boolean isAvailableOnWeekend() {
				return availableOnWeekend;
			}
		}

		public static void main(String[] args) {
			List<Doctor> doctors = Arrays.asList(
					new Doctor("Dr. Smith", "Cardiology", true),
					new Doctor("Dr. Johnson", "Neurology", false),
					new Doctor("Dr. Williams", "Pediatrics", true),
					new Doctor("Dr. Brown", "Orthopedics", true),
					new Doctor("Dr. Jones", "Dermatology", false)
			);

			List<Doctor> weekendDoctors = doctors.stream()
					.filter(Doctor::isAvailableOnWeekend)
					.sorted(Comparator.comparing(Doctor::getSpecialty))
					.collect(Collectors.toList());

			System.out.println("Doctors available on weekends sorted by specialty:");
			weekendDoctors.forEach(doctor ->
					System.out.println(doctor.getName() + " - " + doctor.getSpecialty()));
		}
	}

