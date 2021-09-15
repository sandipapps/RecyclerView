package com.sandipbhattacharya.recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    /*
    Image Credit:
    Images in this tutorial are originally made by Konpa (under MIT License)
    Link for download: https://devicons.github.io/devicon/
    License: https://github.com/devicons/devicon/blob/master/LICENSE
     */
    // Declare a RecyclerView object reference
    RecyclerView recyclerView;
    // Declare an adapter
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutmanager;
    // Next, prepare your data set. Create two string arrays for program name and program description respectively.
    String[] programNameList = {"C", "C++", "Java", "Android", "HTML5", "CSS3", "JavaScript", "jQuery", "Bootstrap", "PHP",
            "MySQL", "CodeIgniter", "React", "NodeJS", "AngularJS", "PostgreSQL", "Python", "C#", "Wordpress", "GitHub"};
    String[] programDescriptionList = {"C Description", "C++ Description", "Java Description",
            "Android Description", "HTML5 Description",
            "CSS3 Description", "JavaScript Description", "jQuery Description",
            "Bootstrap Description", "PHP Description", "MySQL Description",
            "CodeIgniter Description", "React Description", "NodeJS Description",
            "AngularJS Description", "PostgreSQL Description", "Python Description",
            "C# Description", "Wordpress Description", "GitHub Description"};
    // Define an integer array to hold the image recourse ids
    int[] programImages = {R.drawable.c, R.drawable.cplusplus,
            R.drawable.java, R.drawable.android, R.drawable.html5,
            R.drawable.css3, R.drawable.javascript, R.drawable.jquery,
            R.drawable.bootstrap, R.drawable.php, R.drawable.mysql,
            R.drawable.codeigniter, R.drawable.react, R.drawable.nodejs,
            R.drawable.angularjs, R.drawable.postgresql, R.drawable.python,
            R.drawable.csharp, R.drawable.wordpress, R.drawable.github};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain a handle for the RecyclerView
        recyclerView = findViewById(R.id.rvProgram);
        // You may use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);
        // Use a linear layout manager
        layoutmanager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutmanager);
        // Create an instance of ProgramAdapter. Pass context and all the array elements to the constructor
        programAdapter = new ProgramAdapter(this, programNameList, programDescriptionList, programImages);
        // Finally, attach the adapter with the RecyclerView
        recyclerView.setAdapter(programAdapter);
    }
}