class MyQueue {
    private Stack<Integer> inbox;
    private Stack<Integer> outbox;
    public MyQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();    
    }
    
    public void push(int x) {
        inbox.push(x);
… * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
