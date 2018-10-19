package application;

import java.io.IOException;

import com.darkprograms.speech.translator.GoogleTranslate;

public class TranslatorExample {
	
	public static void main(String[] args) {
		try {		
//                        System.out.println(GoogleTranslate.translate("vi", "how are you"));
                        
                        // Tagetlanguage. 
                        
                        System.out.println(GoogleTranslate.translate("en", "anh chiến đại ca"));
                        
			//English to GREEK
                        
//                        System.out.println(GoogleTranslate.translate("ig", "how are you"));
//                        
//			System.out.println(GoogleTranslate.translate("el", "how are you"));
//			
//			//English to HAUSA
//			System.out.println(GoogleTranslate.translate("ha", "how are you"));
//			
//			//English to Yoruba
//			System.out.println(GoogleTranslate.translate("yo", "how are you"));
		} catch (IOException e) {
			e.printStackTrace();
		}		
        }
}