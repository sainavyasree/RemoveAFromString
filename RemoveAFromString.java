
public class RemoveAFromString {

    public String removeA(String string)
    {
        int length=string.length();
        String string1="";
        for(int i=0;i<length;i++)
        {
            if(i==0||i==1)
            {
                if(string.charAt(i)!='A')
                    string1=string1+string.charAt(i);
            }
            else
                string1=string1+string.charAt(i);
        }
        return string1;
    }
}
