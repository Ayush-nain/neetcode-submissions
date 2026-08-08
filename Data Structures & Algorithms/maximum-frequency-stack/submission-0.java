class FreqStack {

    // Stores frequency of every number
    HashMap<Integer, Integer> freq;

    // group[f] stores elements whose frequency is f
    Stack<Integer>[] group;

    // Maximum frequency currently present
    int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();

        // Maximum possible frequency is not known,
        // so we can create dynamically using ArrayList.
        group = new Stack[100001];

        for (int i = 0; i < group.length; i++) {
            group[i] = new Stack<>();
        }

        maxFreq = 0;
    }

    public void push(int val) {

        // Increase frequency
        int f = freq.getOrDefault(val, 0) + 1;
        freq.put(val, f);

        // Update maximum frequency
        maxFreq = Math.max(maxFreq, f);

        // Put val into the stack corresponding to frequency f
        group[f].push(val);
    }

    public int pop() {

        // Get the most recently added element
        // among elements having maximum frequency
        int val = group[maxFreq].pop();

        // Decrease its frequency
        int f = freq.get(val) - 1;
        freq.put(val, f);

        // If no elements remain at maxFreq,
        // decrease maxFreq
        if (group[maxFreq].isEmpty()) {
            maxFreq--;
        }

        return val;
    }
}