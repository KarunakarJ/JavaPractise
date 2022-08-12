package com.CP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FastInput {

    static class FastReader
    {
        BufferedReader br; // to read the text from a character-based input stream
        StringTokenizer st; // allows you to break a string into tokens

        public FastReader() {
            // InputStream -> reads bytes
            // BufferedReader -> prefetches characters into buffer to improve performance
            // InputStreamReader -> A Reader works with InputStream and reads characters
            br = new BufferedReader ( new InputStreamReader(System.in) );
        }

        String next()
        {
            // hasMoreElements() -> checks if there is more tokens available
            while (st == null || !st.hasMoreElements())
            {
                try {
                    st = new StringTokenizer(br.readLine()); // reading a line of text
                }
                catch (IOException ie)
                {
                    ie.printStackTrace();
                }
            }
            return st.nextToken();
            // nextToken() -> returns the next token from StringTokenizer Object
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if(st.hasMoreTokens())
                {
                    str = st.nextToken("\n");
                }
                else {
                    str = br.readLine();
                }
            }
            catch (IOException ie) {
                ie.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int k = fr.nextInt();

        // Write your code here

    }
}
