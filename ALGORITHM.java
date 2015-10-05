
public class ALGORITHM  {
    // declare an array which can store DATA objects
    private DATA[] dataList;

    // constructor
    public ALGORITHM()  {
        // set the size of the array
        dataList = new DATA[20];
    }

    // populate the array with DATA objects
    public void setUpDataList()  {
        // loop for each item in the array
        for (int i=0; i<20; i++) {
            //create a new DATA object and store in next array position
            dataList[i] = new DATA();
        }
    }

    // standard algorithm to find largest value, tracking POSITION of value
    public void findMinData()  {
        // choose position of first value
        int minDataPosition = 0;

        // repeat for the REST of the array
        for (int i=1; i<20; i++) {

            //compare current value with best value
            if (dataList[i].getData() < dataList[minDataPosition].getData()) {
                // update the position of the best value
                minDataPosition = i;
            }
        }

        //display results: position and the best (max) value
        System.out.print("Position is:" + minDataPosition + " , Value is:");
        dataList[minDataPosition].displayData();
        System.out.println();
    }

}
