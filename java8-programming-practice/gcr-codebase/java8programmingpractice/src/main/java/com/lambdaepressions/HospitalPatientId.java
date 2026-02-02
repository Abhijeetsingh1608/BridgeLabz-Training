package com.lambdaepressions;
public class HospitalPatientId {
		interface Patient {
		String getPatientId();
	}

	static class InPatient implements Patient {
		private String patientId;

		public InPatient(String patientId) {
			this.patientId = patientId;
		}

		public String getPatientId() {
			return patientId;
		}
	}

	public static void main(String[] args) {
		java.util.List<InPatient> patients = java.util.Arrays.asList(
				new InPatient("P001"),
				new InPatient("P002"),
				new InPatient("P003")
		);

		System.out.println("Patient IDs:");
		patients.stream()
				.map(InPatient::getPatientId)
				.forEach(System.out::println);
	}

}
