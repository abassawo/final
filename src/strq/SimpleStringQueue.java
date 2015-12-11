package strq;

/**
 * Created by c4q-Abass on 12/10/15.
 */
public class SimpleStringQueue implements StringQueue{
    public static String queueStr;

    public SimpleStringQueue(){
        this.queueStr = new String();
    }

    @Override
    public int length() {
        return queueStr.length();
    }

    @Override
    public void enqueue(String string) {
            queueStr += string;
    }

    @Override
    public String dequeue(int length) {
        String result = queueStr.substring(0, length);
        queueStr = queueStr.replace(result, "");
        return result;
    }



}
