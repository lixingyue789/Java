//String类扩展功能实现
public class Strings{
	
     /**
     * 重复某个字符
     * 
     * 例如： 
     * 'a' 5   => "aaaaa"  
     * 'a' -1  => ""
     * 
     * @param c     被重复的字符
     * @param count 重复的数目，如果小于等于0则返回""
     * @return 重复字符字符串
     */
    public static String repeat(char c, int count){
	    if(count<=0){
			return"";		
	    }else{
	        String s="";
		    for(int i=0;i<count;i++){		 
		    s+=c;
	        }	 	
        return s;
        }    
	}

    
     /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如： 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
	
    public static String fillBefore(String str,char filledChar, int len){
		String s="";		
		for(int i=str.length();i<len;i++){	
			s+=filledChar;
		   }
		if(str.length()>len){	
			return str;
		}else{
			return str+s;
		}	
	}
    
    /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串<br>
     * 字符填充于字符串后
     * 例如： 
     * "abc" 'A' 5  => "abcAA"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
	 
    public static String fillAfter(String str,char filledChar, int len){
		String s="";		
		for(int i=str.length();i<len;i++){	
			s+=filledChar;
		   }
		if(str.length()>len){	
			return str;
		}else{
			return s+str;
		}	
	}

    /**
     * 移除字符串中所有给定字符串
     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         字符串
     * @param strToRemove 被移除的字符串
     * @return 移除后的字符串
     */
	
    public static String removeAll(CharSequence str, char strToRemove) {
       String str3="";
	   for(int i=0;i<str.length();i++){
			if(str.charAt(i)==strToRemove){
				//i++;
				continue;
			}
			else{
				str3=str3+str.charAt(i);	
			}			
		}
		return str3;
    }   
    
    /**
     * 反转字符串
     * 例如：abcd => dcba
     *
     * @param str 被反转的字符串
     * @return 反转后的字符串
     */
	 
    public static String reverse(String str) {
        if(str == null || str.equals("")){
			return str;
		}
		byte[] bytes = str.getBytes();
		for(int l = 0,h = str.length() - 1;l < h;l ++,h --){
			byte temp = bytes[l];
			bytes[l] = bytes[h];
			bytes[h] = temp;
		}
		return new String(bytes);
    }
	
	public static void main(String[] args){
		System.out.println(repeat('d',7));
	 	System.out.println(fillBefore("abc",'A',6));
		System.out.println(fillAfter("abc",'A',6));
		System.out.println(removeAll("aa-cc-vv-ff",'-'));
		System.out.println(reverse("abcdefg"));	
	}

}