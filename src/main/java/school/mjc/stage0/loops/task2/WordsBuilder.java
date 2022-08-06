package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i=0, length = chars.length-1;
        String result="";
        while (i<=length)
        {
            result = result + chars[i]; //result.concat(chars[i]);
            i++;
        }
        System.out.println(result);
    }
}
