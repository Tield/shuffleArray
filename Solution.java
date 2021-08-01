class Solution {

    /*------Variables------ */
    private List<Integer> original;
    private List<Integer> acomodada;
    int[] numeros;
   
    
    public Solution(int[] nums) {
        this.original = new ArrayList<>();
        this.numeros = new int[nums.length];
        for(int i : nums){
            original.add(i);
        }
        this.acomodada = new ArrayList<>(original);
    }
    
    
    /** Resetea el arreglo a su forma original y lo muestra. */
    public int[] reset() {
        add(original);
        return this.numeros;
    }
    
    /** Retorna el arreglo reacomodado. */
    public int[] shuffle() {
        Collections.shuffle(acomodada);
        add(acomodada);
        return this.numeros;
        
    }
    /** Funcion para sortear numeros dentro del arreglo */
    private void add(List<Integer> list){
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = list.get(i);
        }
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
