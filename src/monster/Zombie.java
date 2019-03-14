/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monster;

/**
 *
 * @author ceribellig8098
 */
public class Zombie implements Monster{
    //add instance variables
        private String name;
        private int size;
        private int order;

	//add a constructor
        public Zombie(String n, int s, int o){
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
            return "Zombie " + order + " - " + name + " " + size;
        }
}
