import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.materialdesign.R
import com.compose.materialdesign.features.material_design3.features.card.CardItems
import com.compose.materialdesign.features.material_design3.features.card.CardSamplePreview
import com.compose.materialdesign.features.material_design3.features.card.ClickableCardSamplePreview
import com.compose.materialdesign.features.material_design3.features.card.ClickableElevatedCardSamplePreView
import com.compose.materialdesign.features.material_design3.features.card.ClickableOutlinedCardSamplePreview
import com.compose.materialdesign.features.material_design3.features.card.ElevatedCardSamplePreView
import com.compose.materialdesign.features.material_design3.features.card.OutlinedCardSamplePreview


@Composable
fun MainCardScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "CardsViewScreen") {
        composable("CardsViewScreen") {
            CardsViewScreen(navController)
        }
        composable(CardItems.CardSample.route) {
            CardSamplePreview()
        }
        composable(CardItems.ClickableCardSample.route) {
            ClickableCardSamplePreview(onClick = {})
        }
        composable(CardItems.ElevatedCardSample.route) {
            ElevatedCardSamplePreView()
        }
        composable(CardItems.ClickableElevatedCardSample.route) {
            ClickableElevatedCardSamplePreView(onClick = {})
        }
        composable(CardItems.OutlinedCardSample.route) {
            OutlinedCardSamplePreview()
        }

        composable(CardItems.ClickableOutlinedCardSample.route) {
            ClickableOutlinedCardSamplePreview(onClick = {})
        }


    }
}


@Composable
fun CardsViewScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        CardsViewScreenPreview(
            title = "CardSample",
            onClick = { navController.navigate(CardItems.CardSample.route) }
        )
        CardsViewScreenPreview(
            title = "ClickableCardSample",
            onClick = { navController.navigate(CardItems.ClickableCardSample.route) }
        )
        CardsViewScreenPreview(
            title = "ElevatedCardSample",
            onClick = { navController.navigate(CardItems.ElevatedCardSample.route) }
        )
        CardsViewScreenPreview(
            title = "ClickableElevatedCardSample",
            onClick = { navController.navigate(CardItems.ClickableElevatedCardSample.route) }
        )
        CardsViewScreenPreview(
            title = "OutlinedCardSample",
            onClick = { navController.navigate(CardItems.OutlinedCardSample.route) }
        )
        CardsViewScreenPreview(
            title = "ClickableOutlinedCardSample",
            onClick = { navController.navigate(CardItems.ClickableOutlinedCardSample.route) }
        )
    }

}


@Composable
fun CardsViewScreenPreview(title: String, onClick: ()-> Unit) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .clickable { onClick() }
            .border(width = 0.5.dp, color = Color.White, shape = ShapeDefaults.Small),
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        ) {

                Text(
                    text = title,
                    style = TextStyle(fontSize = 15.sp),
                    modifier = Modifier.padding(15.dp)
                )
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                    modifier = Modifier.padding(15.dp)
                )
            }
        }
    }
}