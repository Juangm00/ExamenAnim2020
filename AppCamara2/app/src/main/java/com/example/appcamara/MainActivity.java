package com.example.appcamara;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ImageView mImageViewFoto;
    Button mBotonFoto;
    String mAbsolutePath = "";
    final int FOTO_CONST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageViewFoto = (ImageView) findViewById(R.id.imageViewFoto);
        mBotonFoto = (Button) findViewById(R.id.botonFoto);

        mBotonFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hacerFoto();
            }
        });

    }
    private void hacerFoto() {
        Intent hacerFotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (hacerFotoIntent.resolveActivity(getPackageManager()) != null){
            File fotoFile = null;

            try {
                fotoFile = createFotoFile();

            }catch (Exception e){
                e.printStackTrace();
            }
            if (fotoFile != null){
                Uri fotoUri = FileProvider.getUriForFile(MainActivity.this, "com.example.appcamara", fotoFile);
                hacerFotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, fotoUri);
                startActivityForResult(hacerFotoIntent, FOTO_CONST);
            }
        }
    }

    private File createFotoFile() throws IOException {
        String timestamp = new SimpleDateFormat("yyyymmdd HHmmss").format(new Date());
        String ImageNombre = "Imagen " + timestamp;

        File guardarFile = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        File fotoFile = File.createTempFile(
                ImageNombre, ".jpg", guardarFile
        );
        mAbsolutePath = fotoFile.getAbsolutePath();
        return fotoFile;

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FOTO_CONST && resultCode == RESULT_OK) {
            Uri uri = Uri.parse(mAbsolutePath);
            mImageViewFoto.setImageURI(data.getData());
        }
    }
}