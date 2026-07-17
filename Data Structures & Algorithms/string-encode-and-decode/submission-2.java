class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder ans=new StringBuilder();
        for(String s:strs)
        {
            ans.append(s.length());
            ans.append("#");
            ans.append(s);
        }
        return ans.toString();
    }

    public List<String> decode(String str) 
    {
        ArrayList<String> res=new ArrayList<>();
        int i=0,j=0;
        while(i<str.length())
        {
            j=i;
            while(str.charAt(j) != '#')
            {
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            String word=str.substring(j+1,j+1+len);
            res.add(word);

            i=j+1+len;
        }
        return res;
    }
}
