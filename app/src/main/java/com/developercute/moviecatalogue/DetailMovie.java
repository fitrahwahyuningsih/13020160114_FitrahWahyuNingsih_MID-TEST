package com.developercute.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailMovie extends AppCompatActivity {
    private String[] detailSingkatTV1 = new String[]{"TV-PG Drama, Sci-Fi & Fantasy44m\n\n\nThe fastest man alive."};
    private int[] photoPemainTV1 = new int[]{R.drawable.flash1,R.drawable.flash2,R.drawable.flash3,R.drawable.flash4, R.drawable.flash5};
    private String[] namaPemainTV1 = new String[]{"Grant Gustin\nThe Flash","Candice Patton\nIris West-Allen","Carlos Valdes\nCisco Ramon","Danielle Panabaker\nKiller Frost","Tom Cavanagh\nHarrison Wells"};
    private String[] detailSingkatTV2 = new String[]{"TV-14Drama, Sci-Fi & Fantasy, Action & Adventure43m\n\n\nNot all heroes are super"};
    private int[] photoPemainTV2 = new int[]{R.drawable.shiled1,R.drawable.shiled2,R.drawable.shiled3,R.drawable.shiled4, R.drawable.shiled5};
    private String[] namaPemainTV2 = new String[]{"Clark Gregg\nPhil Coulson","Ming-Na Wen\nQuake","Chloe Bennet\nMelinda May","Caestecker\nLeo Fitz","Elizabeth\nJemma Simmons"};
    private String[] detailSingkatTV3 = new String[]{"TV-14Sci-Fi & Fantasy, Drama, Action & Adventure43m\n\n\nSurvival isn't who you are. It's who you become"};
    private int[] photoPemainTV3 = new int[]{R.drawable.the_100_1,R.drawable.the_100_2,R.drawable.the_100_3,R.drawable.the_100_4, R.drawable.the_100_5};
    private String[] namaPemainTV3 = new String[]{"Eliza Taylor\nClarke Griffin","Bob Morley\nBellamy Blake","Marie Avgeropoulos\nOctavia Blake","Lindsey Morgan\nRaven Reyes","Richard Harmon\nJohn Murphy"};
    private String[] detailSingkatTV4 = new String[]{"TV-MASci-Fi & Fantasy50m\n\n\nPrepare to brace"};
    private int[] photoPemainTV4 = new int[]{R.drawable.snow_piercer1,R.drawable.snow_piercer2,R.drawable.snow_piercer3,R.drawable.snow_piercer4, R.drawable.snow_piercer5};
    private String[] namaPemainTV4 = new String[]{"Jennifer Connelly\nMelanie Cavill","Daveed Diggs\nAndrew Layton","Mickey Sumner\nBess Till","Susan Park\nJinju Seong","Benjamin Haigh\nFergus McConnell"};
    private String[] detailSingkatTV5 = new String[]{"Action & Adventure, Drama, War & Politics"};
    private int[] photoPemainTV5 = new int[]{R.drawable.resurrection1,R.drawable.resurrection2,R.drawable.resurrection3,R.drawable.resurrection4};
    private String[] namaPemainTV5 = new String[]{"Engin Altan\nErtuğrul","Nurettin Sönmez\nBamsı Beyrek","Esra Bilgiç\nHalime","Didem Balçın\nSelcan"};
    private String[] detailSingkatTV6 = new String[]{"TV-14Drama, Mystery, Sci-Fi & Fantasy45m\n\nBetween darkness and deliverance"};
    private int[] photoPemainTV6 = new int[]{R.drawable.supernatural1,R.drawable.supernatural2,R.drawable.supernatural3,R.drawable.supernatural4, R.drawable.supernatural5};
    private String[] namaPemainTV6 = new String[]{"Jensen Ackles\nDean Winchester","Jared Padalecki\nSam Winchester","Misha Collins\nCastiel","Jim Beaver\nBobby Singer","Alexander Calvert\nJack"};
    private String[] detailSingkatTV7 = new String[]{"TV-Y7Animation, Action & Adventure, Sci-Fi & Fantasy22m"};
    private int[] photoPemainTV7 = new int[]{R.drawable.pokemon_journey1,R.drawable.pokemon_journey2,R.drawable.pokemon_journey3,R.drawable.pokemon_journey4, R.drawable.pokemon_journey5};
    private String[] namaPemainTV7 = new String[]{"Ikue Otani\nPikachu","Unsho Ishizuka\nProfessor Oak","Megumi\nMusashi","Shin-ichiro Miki\nKojirou","Inuko Inuyama\nMeowth"};
    private String[] detailSingkatTV8 = new String[]{"TV-14Comedy, Drama25m\n\n\nI'll be there for you"};
    private int[] photoPemainTV8 = new int[]{R.drawable.friends1,R.drawable.friends2,R.drawable.friends3,R.drawable.friends4, R.drawable.friends5};
    private String[] namaPemainTV8 = new String[]{"Matthew Perry\nChandler Bing","Matt LeBlanc\nJoey Tribbiani","Courteney Cox\nMonica Geller","David Schwimmer\nRoss Geller","Jennifer Aniston\nRachel Green"};
    private String[] detailSingkatTV9 = new String[]{"TV-14Action & Adventure, Drama, Crime, Sci-Fi & Fantasy43m\n\n\nA new generation of justice."};
    private int[] photoPemainTV9 = new int[]{R.drawable.stargirl1,R.drawable.stargirl2,R.drawable.stargirl3,R.drawable.stargirl4, R.drawable.stargirl5};
    private String[] namaPemainTV9 = new String[]{"Brec Bassinger\nStargirl","Meg DeLacy\nShiv","Luke Wilson\nS.T.R.I.P.E.","Amy Smart\nBarbara","JHunter Sansone\nCameron"};
    private String[] detailSingkatTV10 = new String[]{"Comedy, Sci-Fi & Fantasy45m"};
    private int[] photoPemainTV10 = new int[]{R.drawable.my_girlfriend_is_an_alien1,R.drawable.my_girlfriend_is_an_alien2,R.drawable.my_girlfriend_is_an_alien3,R.drawable.my_girlfriend_is_an_alien4, R.drawable.my_girlfriend_is_an_alien5};
    private String[] namaPemainTV10 = new String[]{"Thassapak Hsu\nFang Leng","Wan Peng\nChai Xiaoqi","Yang Yue\nJiang Xue","Wang Youjun\nFang Lie","Zhang Meng\nSister Chai"};
    private ImageView Photo;
    private TextView JudulTV, DeskTV, DetailSingkat, NamaPemain;
    private Toolbar toolbar;
    private ArrayList<PemeranModel> listdata;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Detail TV");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Photo = findViewById(R.id.poster);
        JudulTV = findViewById(R.id.JudulTV);
        DeskTV = findViewById(R.id.Deskripsi);
        DetailSingkat = findViewById(R.id.DeskSingkat);
        recyclerView = findViewById(R.id.Recyclerview);

        Intent intent = getIntent();
        int photo = intent.getIntExtra("foto",0);
        String judulTV = intent.getStringExtra("judulTV");
        String deskTV = intent.getStringExtra("deskTV");

        Photo.setImageResource(photo);
        JudulTV.setText(judulTV);
        DeskTV.setText(deskTV);

        setdata(judulTV);
    }

    private void setdata(String judulTV) {
        listdata = new ArrayList<>();
        if(judulTV.equals("Flash (2014)")){
            DetailSingkat.setText(detailSingkatTV1[0]);
            for (int i=0; i<namaPemainTV1.length; i++){
                listdata.add(new PemeranModel(photoPemainTV1[i],namaPemainTV1[i]));
            }
        }

        if(judulTV.equals("Shiled (2013)")){
            DetailSingkat.setText(detailSingkatTV2[0]);
            for (int i=0; i<namaPemainTV2.length; i++){
                listdata.add(new PemeranModel(photoPemainTV2[i],namaPemainTV2[i]));
            }
        }

        if(judulTV.equals("The 100 (2014)")){
            DetailSingkat.setText(detailSingkatTV3[0]);
            for (int i=0; i<namaPemainTV3.length; i++){
                listdata.add(new PemeranModel(photoPemainTV3[i],namaPemainTV3[i]));
            }
        }

        if(judulTV.equals("Snow Piercer (2020)")){
            DetailSingkat.setText(detailSingkatTV4[0]);
            for (int i=0; i<namaPemainTV4.length; i++){
                listdata.add(new PemeranModel(photoPemainTV4[i],namaPemainTV4[i]));
            }
        }

        if(judulTV.equals("Resurrection (2014)")){
            DetailSingkat.setText(detailSingkatTV5[0]);
            for (int i=0; i<namaPemainTV5.length; i++){
                listdata.add(new PemeranModel(photoPemainTV5[i],namaPemainTV5[i]));
            }
        }

        if(judulTV.equals("Supernatural (2005)")){
            DetailSingkat.setText(detailSingkatTV6[0]);
            for (int i=0; i<namaPemainTV6.length; i++){
                listdata.add(new PemeranModel(photoPemainTV6[i],namaPemainTV6[i]));
            }
        }

        if(judulTV.equals("Pokemon Journey (1997)")){
            DetailSingkat.setText(detailSingkatTV7[0]);
            for (int i=0; i<namaPemainTV7.length; i++){
                listdata.add(new PemeranModel(photoPemainTV7[i],namaPemainTV7[i]));
            }
        }

        if(judulTV.equals("Friends (1994)")){
            DetailSingkat.setText(detailSingkatTV8[0]);
            for (int i=0; i<namaPemainTV8.length; i++){
                listdata.add(new PemeranModel(photoPemainTV8[i],namaPemainTV8[i]));
            }
        }

        if(judulTV.equals("Stargirl (2020)")){
            DetailSingkat.setText(detailSingkatTV9[0]);
            for (int i=0; i<namaPemainTV9.length; i++){
                listdata.add(new PemeranModel(photoPemainTV9[i],namaPemainTV9[i]));
            }
        }

        if(judulTV.equals("My Girlfriend Is Alien (2019)")){
            DetailSingkat.setText(detailSingkatTV10[0]);
            for (int i=0; i<namaPemainTV10.length; i++){
                listdata.add(new PemeranModel(photoPemainTV10[i],namaPemainTV10[i]));
            }
        }
        setupRecyclerView(listdata);
    }

    private void setupRecyclerView(List<PemeranModel> listData) {
        PemeranTVAdapter myadapter = new PemeranTVAdapter(this, listData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myadapter);
    }
}
