package com.example.recycleview;

import java.util.ArrayList;

public class Data {
    private static String[] title = new String[]{"Brunei","Filipina","Indonesia","Kamboja","Laos","Malaysia","Myanmar","Singapura","Thailand","Vietnam"};

    private static int[] thumbnail = new
            int[]{R.drawable.brunei,R.drawable.filipina,
            R.drawable.indonesia,R.drawable.kamboja,R.drawable.laos,R.drawable.malaysia,R.drawable.myanmar,R.drawable.singapura,R.drawable.thailand,R.drawable.vietnam};

    private static String[] preview = new String[]{
     "Thailand Bentuk negara: Monarki konstitusional\n" +
            "Filipina Bentuk negara: Republik presidensial\n" +
            "Indonesia Bentuk negara : Republik presidensial\n" +
             "Malaysia Bentuk negara: Monarki federasi\n" +
             "Singapura Bentuk negara : Republik Parlementer\n" +
             "Brunei Darusalam Bentuk negara: Monarki absolut\n" +
             "Vietnam Bentuk negara : Republik sosialis\n" +
             "Laos Bentuk negara : Republik sosialis\n" +
             "Kamboja Bentuk negara: Monarki konstitusional\n" +
             "Myanmar bentuk negara : Republik parlementer"


    };
    public static ArrayList<Model> getListData(){
        Model Model = null;
        ArrayList<Model> list = new ArrayList<>();
        for (int i = 0; i <title.length; i++){
           Model = new Model();
           Model.setLambangTeam(thumbnail[i]);
           Model.setNamaTeam(title[i]);
           Model.setPrivew(preview[i]);
            list.add(Model);
        }
        return list;
    }
}
