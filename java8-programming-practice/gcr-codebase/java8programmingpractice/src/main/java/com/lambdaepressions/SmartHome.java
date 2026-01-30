package com.lambdaepressions;

public class SmartHome {
		interface LightBehavior {
		void activate();
	}
		 public static void main(String[] args) {

		        LightBehavior motionDetected = () -> System.out.println("Lights activated: Bright white light for motion detection.");

		        LightBehavior eveningMode = () -> System.out.println("Lights activated: Warm yellow light for evening ambiance.");

		        LightBehavior voiceCommand = () -> System.out.println("Lights activated: Custom color and brightness as per voice command.");

		        triggerLightBehavior(motionDetected);
		        triggerLightBehavior(eveningMode);
		        triggerLightBehavior(voiceCommand);
		    }

		    static void triggerLightBehavior(LightBehavior behavior) {
		        behavior.activate();
		    }
		}