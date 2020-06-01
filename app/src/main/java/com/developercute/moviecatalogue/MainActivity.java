package com.developercute.moviecatalogue;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private ArrayList<MovieModel> list;
    private RecyclerView recyclerView;
    private int[] tvShow = new int[]{R.drawable.flash, R.drawable.shield, R.drawable.the_100, R.drawable.snow_piercer,
            R.drawable.resurrection, R.drawable.supernatural, R.drawable.pokemon_journey, R.drawable.friends, R.drawable.stargirl,
            R.drawable.my_girlfriend_is_an_alien};
    private String[] JudulTV = new String[]{"Flash (2014)","Shiled (2013)","The 100 (2014)", "Snow Piercer (2020)",
            "Resurrection (2014)","Supernatural (2005)", "Pokemon Journey (1997)","Friends (1994)","Stargirl (2020)",
            "My Girlfriend Is Alien (2019)"};
    private String[] DeskTV = new String[]{"After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
            "Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.",
            "100 years in the future, when the Earth has been abandoned due to radioactivity, the last surviving humans live on an ark orbiting the planet — but the ark won't last forever. So the repressive regime picks 100 expendable juvenile delinquents to send down to Earth to see if the planet is still habitable.",
            "Set more than seven years after the world has become a frozen wasteland, the remnants of humanity inhabit a gigantic, perpetually-moving train that circles the globe as class warfare, social injustice and the politics of survival play out.",
            "Ertuğrul Bey and the Knights Templar in the 13th century Alba and step and step with the struggle against brutal Mongols depicts the process of establishing the Ottoman principality.",
            "When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",
            "Join Ash Ketchum, accompanied by his partner Pikachu, as he travels through many regions, meets new friends and faces new challenges on his quest to become a Pokémon Master.",
            "The misadventures of a group of friends as they navigate the pitfalls of work, life and love in Manhattan.",
            "Courtney Whitmore, a smart, athletic and above all else kind girl, discovers her step-father has a secret; he used to be the sidekick to a superhero. \"Borrowing\" the long-lost hero’s cosmic staff, she becomes the unlikely inspiration for an entirely new generation of superheroes.",
            "The alien girl Chai Xiaoqi tells the story of Fang Xiaoqi, the overbearing president of the alien girl who died from the \"Cape Town Planet\", who was suffering from the \"rainy weather heterosexual amnesia\". A high-energy hilarious and romantic cross-star love story. The female host Chai Xiaoqi is not only an alien, but also a true-handed witch. Once she inhales the hormones emitted by the males in the earth, she will fall into the \"flowery state\" and suffer from various diseases. The fun and ridiculously ridiculous romance will restore the singularity of the girl in the perfection of the girl. In order to survive on the human earth, Chai Xiaoqi will use his various super powers to solve one accident after another, like a roller coaster. The ups and downs will make the audience hooked. The male lord is cold and is an alternative overbearing president. When it rains, he will forget the opposite sex that appears around him. For this reason, he and the female host will launch various \"fighting and fighting\" laughter dramas. The experience of high sweetness and romance is expected to be Strongly slammed the girl's heart when it was broadcast."};
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Movie Catalogue");

        recyclerView = findViewById(R.id.recyclerview);
        setData();

    }

    private void setData() {
        list = new ArrayList<>();
        for (int i = 0; i < tvShow.length; i++) {
            list.add(new MovieModel(tvShow[i], JudulTV[i], DeskTV[i]));
        }
        setuprecyclerview(list);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.id_Recyclerview:
                setuprecyclerview(list);
                break;
            case R.id.id_Grid:
                setupRecyclerViewGrid(list);
                break;
            case R.id.id_about:
                about();
                break;
        }
    }

    private void setupRecyclerViewGrid(ArrayList<MovieModel> listData) {
        GridMovieAdapter gridMovieAdapter = new GridMovieAdapter(this, listData);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(gridMovieAdapter);
    }


    void about() {
        Intent i = new Intent(this, AboutActivity.class);
        startActivity(i);
    }

    private void setuprecyclerview(ArrayList<MovieModel> listData) {
        MovieAdapter movieAdapter = new MovieAdapter(this, listData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(movieAdapter);
    }

}
