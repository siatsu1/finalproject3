package com.yusuf.mechaltor.activity;

import static com.yusuf.mechaltor.databinding.ActivityAboutBinding.inflate;
import static java.util.Objects.requireNonNull;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.yusuf.mechaltor.R;
import com.yusuf.mechaltor.databinding.ActivityAboutBinding;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        ActivityAboutBinding binding = inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getPortofoloi(binding.tvPortofolo1, getString(R.string.str_portofoliourl1));
    }

    private void getPortofoloi(TextView view, String url) {
        view.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW)
                .setData(Uri.parse(url))));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}