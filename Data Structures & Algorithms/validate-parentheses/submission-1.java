class Solution {
    public boolean isValid(String s) {
        stack<char>st;

        for(int i=0;i<s.size();i++);
        if(str[i]=='('||str[i]=='['||str[i]=='{'){
            st.push(str[i]);
        }else{
            if(stack.size()==0){
                return false;
            }

        if((st.top()=='('&& str[i]==')')||(st.top()=='['&&str[i]==']')||(st.top()=='{'&&str[i]=='}'))
        }
    }
}
