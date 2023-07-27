package uz.coder.muslimuz.ui;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import uz.coder.muslimuz.R;
import uz.coder.muslimuz.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    NavController navController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().show();
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        navController  = navHostFragment.getNavController();
        NavigationUI.setupWithNavController(binding.bottomView,navController);


        // bu yerni ppt da ko'rsatvadim yaxshilab urgan arzimagan xatolarni qilib o'tiribsan
        binding.bottomView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if (id == R.id.homeFragment){
                    navController.navigate(R.id.homeFragment);
                    return true;
                } else if (id == R.id.tasbehFragment) {
                    navController.navigate(R.id.tasbehFragment);
                    return true;
                } else if (id == R.id.menuFragment) {
                    navController.navigate(R.id.menuFragment);
                    return true;
                }
                return false;
            }
        });



    }
    //buni ham
    @Override
    public void onBackPressed() {
        if (navController.getCurrentDestination().getId() == R.id.homeFragment) {
            super.onBackPressed();
        } else {
            navController.navigateUp();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        return Navigation.findNavController(this,R.id.fragmentContainerView).navigateUp();
    }
}