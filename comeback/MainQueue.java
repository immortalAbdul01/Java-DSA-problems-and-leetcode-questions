package comeback;

public class MainQueue {
    public static void main(String[] args) throws Exception {
        CustomQueue que = new CustomQueue();

        que.insert(12);

        que.insert(56);
        que.insert(6);
        que.insert(16);
        que.insert(96);

        que.Display();
        que.remove();
        System.out.println("End of the first queue");
        que.Display();

    }


}
