package com.funtionalinterfaces.markerinterface;

public class CloningPrototype {
		// Marker interface
	interface Cloneable {
	}

	// Class implementing the marker interface
	static class Document implements Cloneable {
		String title;
		String content;

		Document(String title, String content) {
			this.title = title;
			this.content = content;
		}

		// Method to clone the document
		Document cloneDocument() {
			return new Document(this.title, this.content);
		}
	}

	// Cloning processor that checks for Cloneable interface
	static class CloningProcessor {
		Document cloneIfPossible(Object obj) {
			if (obj instanceof Cloneable) {
				Document doc = (Document) obj;
				return doc.cloneDocument();
			} else {
				System.out.println("Cannot clone: " + obj.getClass().getSimpleName() + " (not cloneable)");
				return null;
			}
		}
	}

	public static void main(String[] args) {
		Document originalDoc = new Document("Design Patterns", "Content about design patterns.");
		String nonCloneableData = "Non-cloneable data";

		CloningProcessor cloningProcessor = new CloningProcessor();
		Document clonedDoc = cloningProcessor.cloneIfPossible(originalDoc);
		if (clonedDoc != null) {
			System.out.println("Cloned Document Title: " + clonedDoc.title);
		}

		cloningProcessor.cloneIfPossible(nonCloneableData);
	}

}
