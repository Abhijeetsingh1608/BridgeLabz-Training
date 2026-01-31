package com.funtionalinterfaces.markerinterface;

public class DataSerialization {
		// Marker interface
	interface Serializable {
	}

	// Class implementing the marker interface
	static class UserData implements Serializable {
		String name;
		int age;

		UserData(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	// Class implementing the marker interface
	static class ConfigSettings implements Serializable {
		String settingName;
		String value;

		ConfigSettings(String settingName, String value) {
			this.settingName = settingName;
			this.value = value;
		}
	}

	// Backup processor that checks for Serializable interface
	static class BackupProcessor {
		void backup(Object obj) {
			if (obj instanceof Serializable) {
				System.out.println("Backing up: " + obj.getClass().getSimpleName());
			} else {
				System.out.println("Cannot back up: " + obj.getClass().getSimpleName() + " (not serializable)");
			}
		}
	}

	public static void main(String[] args) {
		UserData user = new UserData("Alice", 30);
		ConfigSettings config = new ConfigSettings("theme", "dark");
		String nonSerializableData = "Non-serializable data";

		BackupProcessor backupProcessor = new BackupProcessor();
		backupProcessor.backup(user);
		backupProcessor.backup(config);
		backupProcessor.backup(nonSerializableData);
	}

}
