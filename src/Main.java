import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        int sizeOfWords = 0;
        HashMap memory = new HashMap(10);
        Cache lru = (Cache) File.readFromFile("LRUCache.txt");
//        LFUCache lfu = (LFUCache) File.readFromFile("LFUCache.txt");//it should be read from file
        if (lru == null)  lru = new Cache(10);
//        if (lfu == null)
        LFUCache lfu = new LFUCache(10);
        lfu.setCacheMap((CacheMap) File.readFromFile("LFUCache.txt"));
//        lfu.getSize();
        while (true){
            showPrompt();
            op = scanner.nextInt();
            if(op == -1)
                break;
            switch (op){
                case 1:
                    scanner.nextLine();
                    System.out.println("type your word:");
                    String word = scanner.nextLine();
                    System.out.println("type the description:");
                    String descrip = scanner.nextLine();
                    memory =(HashMap) File.readFromFile(File.findPath(word)); ///should be read from file
                    memory.put(word, descrip);
                    File.writeToFile(memory, File.findPath(word));
                    break;
                case 2:
                    System.out.println("how do you want the cache work? \n 1-LFU \n 2-LRU");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("what is your word?");
                    String temp = scanner.nextLine();//scanner int va line ro check kon  ke pasha migof ghablan
                    if (choice == 1) {

                        if(lfu.get(temp) != null)
                            System.out.println("Cache: " + lfu.get(temp));
                        else{
                            memory =(HashMap) File.readFromFile(File.findPath(temp));  ///should be read from file
                            String value = memory.get(temp);
                            System.out.println("Memory: " + value);
                            lfu.put(temp, value);
                        }
                    }
                    else{

                        if(lru.get(temp) != null)
                            System.out.println("Cache: " + lru.get(temp).getValue());
                        else{
                            //HashMap memory = new HashMap(sizeOfWords); ///should be read from file
                            memory =(HashMap) File.readFromFile(File.findPath(temp));
                            String value = memory.get(temp);
                            System.out.println("Memory: " + value);
                            lru.put(temp, value);
                        }
                    }

                    break;
                default:
                    System.out.println("wrong input!!");
            }
            System.out.println("--------------------------");
            File.writeToFile(lru , "LRUCache.txt");
            File.writeToFile(lfu.getCacheMap() , "LFUCache.txt");
        }
        System.out.println("end of the program...");

    }
    private static void showPrompt(){
        System.out.println("what are you going to do?\n" +
                "  1) add\n" +
                "  2) search\n" +
                " -1) exit");
    }
}
