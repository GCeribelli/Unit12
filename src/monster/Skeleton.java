package monster;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import monster.Monster;
import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables
        private String name;
        private int size;
        private int order;

	//add a constructor
        public Skeleton(String n, int s, int o){
            name = n;
            size = s;
            order = o;
        }
	//add code to implement the Monster interface
        public int getHowBig(){
            return size;
        }
        public String getName(){
            return name;
        }
        public boolean isBigger(Monster other){
            return(size>other.getHowBig());
        }
        public boolean isSmaller(Monster other){
            return(size<other.getHowBig());
        }
        public boolean namesTheSame(Monster other){
            return (name.equals(other.getName()));
        }
	//add a toString
        public String toString(){
            return "Skeleton " + order + " - " + name + " " + size;
        }
}