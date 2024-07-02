public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();
    }

    @Override
    public boolean push(int item) throws Exception {
        if(this.isFull()){
            int[] temp = new int[this.data.length*2];

            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(item);
    }
}
