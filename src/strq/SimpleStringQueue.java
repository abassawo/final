package strq;

/**
 * Created by c4q-Abass on 12/10/15.
 */
public class SimpleStringQueue implements StringQueue{
    public static StringBuilder queueStr;

    public SimpleStringQueue(){
        this.queueStr = new StringBuilder();
    }

    @Override
    public int length() {
        return queueStr.length();
    }

    @Override
    public void enqueue(String string) {
            queueStr.append(string);
    }

    @Override
    public String dequeue(int length) {
        queueStr = queueStr.replace(queueStr.length() -  length, queueStr.length(), "");
        return queueStr.toString();
    }



}
