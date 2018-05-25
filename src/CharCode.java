
public class CharCode {
	
	// Decoder
	
	public Character decodeChar(String charCode){
		Character finalChar = new Character("");
		
		return finalChar;
	}
	
	// Encoder
	
	public String encodeChar(Character codeChar){
		String finalCode = "";
		finalCode += codeChar.getName()+">"+codeChar.getLevel()+"<";
		finalCode += codeChar.getRace().getName()+">"+codeChar.getRace().getStrMod()+">"+codeChar.getRace().getConMod()+">"+codeChar.getRace().getIntMod()+">"+codeChar.getRace().getWisMod()+">"+codeChar.getRace().getChaMod()+">"+codeChar.getRace().getDexMod()+"<";
		finalCode += codeChar.getStatus().getHealth()+">"+codeChar.getStatus().getNonlethal()+">"+codeChar.getStatus().isConscious()+"<";
		while(codeChar.getStatus().getEffectList().size() > 0){
			finalCode += codeChar.getStatus().getEffectList().remove(0)+">";
		}
		finalCode += "<"+codeChar.getValues().getStr()+">"+codeChar.getValues().getCon()+">"+codeChar.getValues().getInt()+">"+codeChar.getValues().getWis()+">"+codeChar.getValues().getCha()+">"+codeChar.getValues().getDex()+"<";
		while(codeChar.getInv().size() > 0){
			finalCode += codeChar.getInv().get(0).getName()+">"+codeChar.getInv().get(0).getValue()+">";
			codeChar.getInv().remove(0);
		}
		finalCode += "<";
		return finalCode;
	}
}
