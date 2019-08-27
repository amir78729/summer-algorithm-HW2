import static java.lang.Math.*;

public class HashMap {
    private static int size;
    private HashLink[] table;

    public HashMap() {
        this.size = size;
        table = new HashLink[size];
    }

    public String get(String key){
        int hash = changeToBase10(key) % size;
        if (table[hash] == null)
            return null;
        else{
            HashLink entry = table[hash];
            while (entry.getNext() != null && entry.getKey() != key)
                entry = entry.getNext();
            if (entry == null)
                return "the word doesn't exist!";
            else
                return entry.getValue();
        }
    }

    public void put(String key, String value){
        int hash = changeToBase10(key) % size;
        if (table[hash] == null){
            table[hash] = new HashLink(key,value);
        }
        else {
            HashLink entry = table[hash];
            while (entry.getNext() != null && entry.getKey() != key)
                entry = entry.getNext();
            if (entry.getNext() == null) // check it again!
                entry.setNext(new HashLink(key, value));
            else
                entry.setValue(value);
        }
    }

    private int convertCharToInt(char c){
        int result;
        switch (c){
            case 'a':
                result = 0;
                break;
            case 'b':
                result = 1;
                break;
            case 'c':
                result = 2;
                break;
            case 'd':
                result = 3;
                break;
            case 'e':
                result = 4;
                break;
            case 'f':
                result = 5;
                break;
            case 'g':
                result = 6;
                break;
            case 'h':
                result = 7;
                break;
            case 'i':
                result = 8;
                break;
            case 'j':
                result = 9;
                break;
            case 'k':
                result = 10;
                break;
            case 'l':
                result = 11;
                break;
            case 'm':
                result = 12;
                break;
            case 'n':
                result = 13;
                break;
            case 'o':
                result = 14;
                break;
            case 'p':
                result = 15;
                break;
            case 'q':
                result = 16;
                break;
            case 'r':
                result = 17;
                break;
            case 's':
                result = 18;
                break;
            case 't':
                result = 19;
                break;
            case 'u':
                result = 20;
                break;
            case 'v':
                result = 21;
                break;
            case 'w':
                result = 22;
                break;
            case 'x':
                result = 23;
                break;
            case 'y':
                result = 24;
                break;
            case 'z':
                result = 25;
                break;
            default:
                result = -1;
                break;
        }
        return result;
    }

    private int changeToBase10(String string){
        int result = 0;
        char[] chars = string.toCharArray();
        for(int i = 0; i<chars.length; i++){
            result += convertCharToInt(chars[chars.length - 1 - i]) * pow(26, i);

        }
        return result;
    }
}
