package in.AIML.Chatbot;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.History;
import org.alicebot.ab.MagicBooleans;
import org.alicebot.ab.MagicStrings;
import org.alicebot.ab.utils.IOUtils;


import javax.speech.synthesis.Voice;
//import edu.cmu.sphinx.api.Configuration;
//import edu.cmu.sphinx.api.LiveSpeechRecognizer;
//import edu.cmu.sphinx.api.SpeechResult;

import javax.speech.Engine;
import javax.speech.EngineList;
import javax.speech.Central;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Synthesizer;

public class Chatbot {
	private static final boolean TRACE_MODE = false;
	static String botName = "super";
	 private static String genderToString(int gender) {
	        switch (gender) {       
	        case Voice.GENDER_FEMALE:
	            return "Female";
	        case Voice.GENDER_MALE:
	            return "Male";
	        case Voice.GENDER_NEUTRAL:
	            return "Neutral";
	        case Voice.GENDER_DONT_CARE:
	        default:       
	            return "Unknown";
	        }        
	    }
	public static void main(String[] args) throws IOException {
		// Configuration configuration=new Configuration();
		// configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
		// configuration.setDictionaryPath("file:C:\\Users\\Hp\\eclipse-workspace\\Chatbot\\src\\main\\java\\com\\voicerecog\\resources\\7586.dic");
		// configuration.setLanguageModelPath("file:C:\\Users\\Hp\\eclipse-workspace\\Chatbot\\src\\main\\java\\com\\voicerecog\\resources\\7586.lm");
		// LiveSpeechRecognizer recognize= new LiveSpeechRecognizer(configuration);

		try {
			System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us" + ".cmu_us_kal.KevinVoiceDirectory");
			Central.registerEngineCentral("com.sun.speech.freetts" + ".jsapi.FreeTTSEngineCentral");

			// Create a Synthesizer
			Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
			SynthesizerModeDesc emptyDesc = new SynthesizerModeDesc();        
			 EngineList engineList = Central.availableSynthesizers(emptyDesc);
		        for (int e = 0; e < engineList.size(); e++) {   
			SynthesizerModeDesc desc = (SynthesizerModeDesc) engineList.get(e);
			  Voice[] voices = desc.getVoices();
			for (int v = 0; v < voices.length; v++) {
                System.out.println(
                        desc.getEngineName()+
                        "  Voice:"+voices[v].getName()+ 
                        " Gender:"+genderToString(voices[v].getGender()));                             
            }
        }  

			// Allocate synthesizer
			synthesizer.allocate();
           
			// Resume Synthesizer
			synthesizer.resume();
			String resourcesPath = getResourcesPath();
			System.out.println(resourcesPath);
			MagicBooleans.trace_mode = TRACE_MODE;
			Bot bot = new Bot("super", resourcesPath);
			Chat chatSession = new Chat(bot);
			bot.brain.nodeStats();
			String textLine = "";
			// recognize.startRecognition(true);
			// SpeechResult speechresult;
			// while((speechresult=recognize.getResult())!=null)
			while (true) {
				// textLine = speechresult.getHypothesis();
				System.out.print("Human :");

				textLine = IOUtils.readInputTextLine();
				if ((textLine == null) || (textLine.length() < 1))
					textLine = MagicStrings.null_input;
				if (textLine.equals("stop")) {
					System.exit(0);
				} else if (textLine.equals("learn")) {
					bot.writeQuit();
					System.exit(0);
				} else {
					String request = textLine;
					if (MagicBooleans.trace_mode)
						System.out.println(
								"STATE=" + request + ":THAT=" + ((History) chatSession.thatHistory.get(0)).get(0)
										+ ":TOPIC=" + chatSession.predicates.get("topic"));
				   
					String response = chatSession.multisentenceRespond(request);
					while (response.contains("<"))
						response = response.replace("<", "<");
					while (response.contains(">"))
						response = response.replace(">", ">");
					
				synthesizer.speak(response, null);
					synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);

				
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getResourcesPath() {
		File currDir = new File(".");
		String path = currDir.getAbsolutePath();
		path = path.substring(0, path.length() - 2);
		System.out.println(path);
		String resourcesPath = path + File.separator + "src" + File.separator + "main" + File.separator + "resources";
		return resourcesPath;
	}
}