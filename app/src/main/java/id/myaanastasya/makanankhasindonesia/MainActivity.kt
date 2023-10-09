package id.myaanastasya.makanankhasindonesia

import id.myaanastasya.makanankhasindonesia.ui.theme.MakananKhasIndonesiaTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
//import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//entrypoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MakananKhasIndonesiaTheme() {
                IndonesianFoodApp()
            }
        }
    }
}
//anotasi untuk menggunakan fitur-fitur eksperimental dari pustaka Material3 dalam Jetpack Compose
@OptIn(ExperimentalMaterial3Api::class)
//Fungsi komponen Composable dalam Jetpack Compose di bawah ini merupakan komponen utama aplikasi yang mengatur tampilan utama aplikasi
@Composable
fun IndonesianFoodApp() {
    //mendeklarasikan currentStep sebagai properti yang dapat diubah (var)
    //by remember { mutableStateOf(1) } untuk menginisialisasi dan mengelola nilai properti tersebut
    //akan memicu komposisi ulang komponen yang menggunakannya
    var currentStep by remember { mutableStateOf(1) }
    //membuat UI dengan top app bar
    Scaffold(
        //top app bar, berisi judul
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "10 Makanan Khas Indonesia",
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer,
                    actionIconContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .fillMaxSize() //mengisi seluruh suang yang tersedia
                .padding(innerPadding) //mengatur padding sesuai dg parent
                .background(MaterialTheme.colorScheme.tertiaryContainer),
            color = MaterialTheme.colorScheme.background //mengatur warna background sesuai dengan tema
        ) {
            //menentukan tampilan berdasarkan nilai currentStep
            when (currentStep) {
                1 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.rendang,
                        contentDescriptionResourceId = R.string.rendang,
                        nameResourceId = R.string.rendang,
                        originiResourceId = R.string.sumatera_barat,
                        onButtonNextClick = { currentStep = 2 },
                        onButtonPreviousClick = { currentStep = 10 })
                }
                2 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.gulai_belacan,
                        contentDescriptionResourceId = R.string.gulai_belacan,
                        nameResourceId = R.string.gulai_belacan,
                        originiResourceId = R.string.riau,
                        onButtonNextClick = { currentStep = 3 },
                        onButtonPreviousClick = { currentStep = 1 })
                }
                3 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.pempek,
                        contentDescriptionResourceId = R.string.pempek,
                        nameResourceId = R.string.pempek,
                        originiResourceId = R.string.sumatera_selatan,
                        onButtonNextClick = { currentStep = 4 },
                        onButtonPreviousClick = { currentStep = 2 })
                }
                4 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.ayam_betutu,
                        contentDescriptionResourceId = R.string.ayam_betutu,
                        nameResourceId = R.string.ayam_betutu,
                        originiResourceId = R.string.bali,
                        onButtonNextClick = { currentStep = 5 },
                        onButtonPreviousClick = { currentStep = 3 })
                }
                5 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.ayam_taliwang,
                        contentDescriptionResourceId = R.string.ayam_taliwang,
                        nameResourceId = R.string.ayam_taliwang,
                        originiResourceId = R.string.ntb,
                        onButtonNextClick = { currentStep = 4 },
                        onButtonPreviousClick = { currentStep = 6 })
                }
                6 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.cakalang,
                        contentDescriptionResourceId = R.string.cakalang,
                        nameResourceId = R.string.cakalang,
                        originiResourceId = R.string.papua_barat,
                        onButtonNextClick = { currentStep = 5 },
                        onButtonPreviousClick = { currentStep = 7 })
                }
                7 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.gence_ruan,
                        contentDescriptionResourceId = R.string.gence_ruan,
                        nameResourceId = R.string.gence_ruan,
                        originiResourceId = R.string.kaltim,
                        onButtonNextClick = { currentStep = 6 },
                        onButtonPreviousClick = { currentStep = 8 })
                }
                8 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.mi_gomak,
                        contentDescriptionResourceId = R.string.mi_gomak,
                        nameResourceId = R.string.mi_gomak,
                        originiResourceId = R.string.sumatera_utara,
                        onButtonNextClick = { currentStep = 7 },
                        onButtonPreviousClick = { currentStep = 9 })
                }
                9 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.gudeg,
                        contentDescriptionResourceId = R.string.gudeg,
                        nameResourceId = R.string.gudeg,
                        originiResourceId = R.string.diy,
                        onButtonNextClick = { currentStep = 8 },
                        onButtonPreviousClick = { currentStep = 10 })
                }
                10 -> {
                    GambardanTeksMakanan(
                        drawableResourceId = R.drawable.lontong_balap,
                        contentDescriptionResourceId = R.string.lontong_balap,
                        nameResourceId = R.string.lontong_balap,
                        originiResourceId = R.string.jatim,
                        onButtonNextClick = { currentStep = 9 },
                        onButtonPreviousClick = { currentStep = 1 })
                }
            }
        }
    }
}

//Fungsi komponen Composable di bawah ini merupakan fungsi untuk menampilkan teks, gambar, serta tombol navigasi
@Composable
fun GambardanTeksMakanan(
    drawableResourceId: Int, //ID untuk menampilkan gambar makanan
    contentDescriptionResourceId: Int, //deskripsi konten gambar
    nameResourceId: Int, //nama makanan
    originiResourceId: Int, //asal makanan
    onButtonNextClick: () -> Unit, //Fungsi lambda yang akan dipanggil ketika tombol "Next" ditekan
    onButtonPreviousClick: () -> Unit, //Fungsi lambda yang akan dipanggil ketika tombol "Previous" ditekan
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(25.dp)
    ) {
        ButtonsNavigation(
            onButtonNextClick = onButtonNextClick,
            onButtonPreviousClick = onButtonPreviousClick,
            modifier = Modifier.fillMaxWidth() //Untuk menyesuaikan tombol previous dan next diberbagai layar atau mengubah tombol previous dan next menjadi responsif
        )
        Spacer(modifier = Modifier.height(8.dp))
        Picture(
            drawableResourceId = drawableResourceId,
            contentDescriptionResourceId = contentDescriptionResourceId,
            modifier = Modifier
                .weight(1f)
        )
        TeksNamaDanAsal(
            nameResourceId = nameResourceId,
            originResourceId = originiResourceId,
            modifier = Modifier
                .padding(6.dp)
        )
    }
}

//Fungsi komponen Composable dalam Jetpack Compose di bawah ini merupakan fungsi Picture yang dimana untuk mengatur tampilan gambar
@Composable
fun Picture(
    drawableResourceId: Int,
    contentDescriptionResourceId: Int,
    modifier: Modifier = Modifier,
) {
    Surface(
        color = MaterialTheme.colorScheme.background,

        modifier = modifier
            .wrapContentHeight()
            .border(
                BorderStroke(2.dp, Color(105, 105, 105))
            )
    ) {
        Image(
            painter = painterResource(id=drawableResourceId),
            contentDescription = stringResource(contentDescriptionResourceId),
            modifier = modifier
                .padding(14.dp)
        )
    }
}
//Fungsi komponen Composable dalam Jetpack Compose di bawah ini merupakan fungsi ButtonsNavigation mengatur tombol navigasi Previous dan Next
@Composable
fun ButtonsNavigation(
    modifier: Modifier = Modifier,
    onButtonNextClick: () -> Unit,
    onButtonPreviousClick: () -> Unit
) {
    Row(
        modifier = modifier
            .wrapContentWidth(Alignment.CenterHorizontally),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Button(
            modifier = Modifier
                .padding(4.dp)
                .weight(1f),
            onClick = onButtonPreviousClick
        ) {
            Text(
                text = stringResource(id = R.string.button_previous),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Button(
            modifier = Modifier
                .padding(4.dp)
                .weight(1f),
            onClick = onButtonNextClick
        ) {
            Text(
                text = stringResource(id = R.string.button_next),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
//Fungsi komponen Composable dalam Jetpack Compose di bawah ini merupakan fungsi TitleAndAuthorText untuk mengatur tampilan teks judul dan penulis karya seni dengan menggunakan warna background
@Composable
fun TeksNamaDanAsal(
    modifier: Modifier = Modifier,
    nameResourceId: Int,
    originResourceId: Int
) {
    Surface(
        color = Color.White, //Untuk mengatur warna background teks judul dan penulis karya seni
        modifier = modifier,
    ) {
        Column(
            modifier = Modifier.padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(nameResourceId),
                fontSize = 24.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = stringResource(originResourceId),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif
            )
        }
    }
}



//Fungsi komponen Composable dalam Jetpack Compose di bawah ini merupakan fungsi ArtSpacePreview yang digunakan untuk untuk menampilkan preview atau pratinjau dari ArtSpaceApp
@Preview
@Composable
fun MakananIndonesiaPreview() {
    MakananKhasIndonesiaTheme() {
        IndonesianFoodApp()
    }
}