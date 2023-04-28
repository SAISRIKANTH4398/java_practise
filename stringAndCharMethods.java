
class stringMethods {
    public static void main(String[] args){
        String mobile = "    964335456  ";
        String lower = "AFSMBDfbd";
        String upper = "dvksvkdSAKVD";
        String url = "https://www.google.com/";
        String mail = "sreekanth@gmail.com";
        String programmingLanguage = "Java";
        String sentence = "teh cat and teh dog";
        System.out.println(url.startsWith("https://"));  //returns boolean value
        System.out.println(mail.endsWith("@gmail.com"));
        System.out.println(mobile.trim());     //removes trailing and ending spaces
        System.out.println(lower.toLowerCase());  //converts to lower case
        System.out.println(upper.toUpperCase());  //converts to upper case
        System.out.println(programmingLanguage.replace('a','e')); //replaces all the occurences
        System.out.println(sentence.replaceFirst("teh", "the")); //replaces first occurence & only accepts the string values
    }
}
