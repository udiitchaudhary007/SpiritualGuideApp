package com.example.spiritualguideapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.spiritualguideapp.R;
import com.example.spiritualguideapp.models.Course;

public class CourseDetailFragment extends Fragment {

    private static final String ARG_COURSE = "course";
    private Course course;

    public static CourseDetailFragment newInstance(Course course) {
        CourseDetailFragment fragment = new CourseDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_COURSE, course);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            course = getArguments().getParcelable(ARG_COURSE);
        }
    }

    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_course_detail, container, false);

        // Use the EXACT IDs from your XML layout
        TextView title = view.findViewById(R.id.courseTitle);
        TextView description = view.findViewById(R.id.courseDescription);
        Button btnStart = view.findViewById(R.id.startCourseButton);

        if (course != null) {
            title.setText(course.getTitle());
            description.setText(course.getDescription());
        }

        btnStart.setOnClickListener(v -> {
            // Handle start course
        });

        return view;
    }
}