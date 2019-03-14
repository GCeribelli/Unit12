package word;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src/word/words.dat"));

		int size = file.nextInt();
		file.nextLine();
                
		ArrayList<Word> a = new ArrayList<Word>();
                for(int i = 0; i < size; i++){
                    a.add(new Word(file.nextLine()));
                }
                
                for(int n = 0; n < size; n++){
                    for(int i = 1; i < size; i++){
                        if(a.get(i).compareTo(a.get(i-1)) == -1){
                            Collections.swap(a,i,i-1);
                        }
                    }
                }
                
                for(int i = 0; i < size; i++){
                    System.out.println(a.get(i).toString());
                }
                
                
	}
}