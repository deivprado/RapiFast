package com.example.rapifast1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rapifast1.Adapter.FoodAdapter;
import com.example.rapifast1.Objects.Food;
import com.example.rapifast1.R;
import com.example.rapifast1.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, getContext());
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void getFood(){
        Food food1 = new Food(
                R.drawable.ic_launcher_background,
                "Food1",
                "kmldwakmdawkmdkmlwaldkmçawlçkmdçlkmwaçdklwadwadkmwakmdlwakmlçdwakmlçdkmlçwa",
                "$ 120.00"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.ic_launcher_background,
                "Food2",
                "kmldwakmdawkmdkmlwaldkmçawlçkmdçlkmwaçdklwadwadkmwakmdlwakmlçdwakmlçdkmlçwa",
                "$ 120.00"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.ic_launcher_background,
                "Food3",
                "kmldwakmdawkmdkmlwaldkmçawlçkmdçlkmwaçdklwadwadkmwakmdlwakmlçdwakmlçdkmlçwa",
                "$ 120.00"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.ic_launcher_background,
                "Food4",
                "kmldwakmdawkmdkmlwaldkmçawlçkmdçlkmwaçdklwadwadkmwakmdlwakmlçdwakmlçdkmlçwa",
                "$ 120.00"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.ic_launcher_background,
                "Food5",
                "kmldwakmdawkmdkmlwaldkmçawlçkmdçlkmwaçdklwadwadkmwakmdlwakmlçdwakmlçdkmlçwa",
                "$ 120.00"
        );
        foodList.add(food5);
    }
}