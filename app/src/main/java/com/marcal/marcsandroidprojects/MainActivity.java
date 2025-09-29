package com.marcal.marcsandroidprojects;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView projectsView = findViewById(R.id.recycler_view_project);

        Project[] projects = {
                new Project("Getting Started App",
                        "This is my very first Android 'Hello World' App.",
                        R.drawable.getting_started),
                new Project("Motivation Quote App",
                        "Learnt how to create a simple layout with basic elements.",
                        R.drawable.quote),
                new Project("BMI Calculator",
                        "learnt how to compose various view elements (Text, radio button group, Edit text and buttons) and learnt about listener implementation.",
                        R.drawable.calculator),
                new Project("Inches Converter",
                        "a basic converter.",
                        R.drawable.tape),
                new Project("Grab a Spoon",
                        "A menu app for restaurant, learnt how to compose various layouts and navigate activities.",
                        R.drawable.hungry_developer),
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        projectsView.setAdapter(adapter);
    }


}