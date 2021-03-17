package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] world, char[]pref){
        boolean result = true;
        for(int i = 0; i < world.length-1; i++){
            for(int j = 0 ; j < pref.length-1;j++) {
                if(world[i] != pref[j+1]) {
                    result = false;
                }
            }
        }
        return result;
    }
}
