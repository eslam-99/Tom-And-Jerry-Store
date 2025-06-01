package com.example.tom_and_jerry.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tom_and_jerry.R
import com.example.tom_and_jerry.models.TomItemModel
import com.example.tom_and_jerry.ui.theme.BackgroundWhite
import com.example.tom_and_jerry.ui.theme.BorderGrey
import com.example.tom_and_jerry.ui.theme.IBMPlexSansArabic
import com.example.tom_and_jerry.ui.theme.LightBlue
import com.example.tom_and_jerry.ui.theme.MedGreyColor
import com.example.tom_and_jerry.ui.theme.PrimaryColor
import com.example.tom_and_jerry.ui.theme.TextAccentColor
import com.example.tom_and_jerry.ui.theme.TextMedGreyColor
import com.example.tom_and_jerry.ui.theme.TextPrimaryColor
import com.example.tom_and_jerry.ui.theme.TextSecondaryColor
import com.example.tom_and_jerry.ui.theme.TextWhiteColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BackgroundWhite)
            .padding(horizontal = 16.dp)
            .padding(top = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_1),
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(48.dp)
                    .clip(RoundedCornerShape(12.dp))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column(
                verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()
            ) {
                Text(
                    text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    color = TextPrimaryColor,
                )
                Text(
                    text = "Which Tom do you want to buy?",
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    color = TextSecondaryColor,
                )
            }
            Spacer(Modifier.weight(1f))
            BadgedBox(
                modifier = Modifier.padding(top = 2.dp),
                badge = {
                    Badge(
                        content = {
                            Text(
                                text = "3",
                                fontFamily = IBMPlexSansArabic,
                                color = Color.White,
                                fontSize = 10.sp,
                                lineHeight = 13.sp,
                                letterSpacing = 0.sp,
                                fontWeight = FontWeight.Medium,
                                textAlign = TextAlign.Center
                            )
                        },
                        containerColor = PrimaryColor,
                        modifier = Modifier.size(14.dp).padding(0.dp)
                    )
                }
            ) {
                Box(
                    modifier = Modifier
                        .padding(vertical = 2.dp)
                        .padding(end = 1.dp)
                        .size(40.dp)
                        .border(
                            width = 1.dp,
                            color = BorderGrey.copy(alpha = 0.15F),
                            shape = RoundedCornerShape(12.dp)
                        ),
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = "Notification",
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.Center),
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            BasicTextField(
                value = "",
                textStyle = TextStyle(
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    color = TextMedGreyColor,
                ),
                onValueChange = {},
                modifier = Modifier
                    .weight(1f)
                    .height(48.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = Color.White),
                decorationBox = { innerTextField ->
                    TextFieldDefaults.DecorationBox(
                        value = "",
                        placeholder = {
                            Text(
                                text = "Search about tom ...",
                                fontFamily = IBMPlexSansArabic,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp,
                                color = TextMedGreyColor,
                            )
                        },
                        prefix = {
                            Image(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = "Search",
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .size(24.dp),
                                colorFilter = ColorFilter.tint(
                                    color = MedGreyColor
                                )
                            )
                        },
                        visualTransformation = VisualTransformation.None,
                        innerTextField = innerTextField,
                        singleLine = true,
                        enabled = true,
                        interactionSource = remember { MutableInteractionSource() },
                        contentPadding = PaddingValues(12.dp),
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                    )
                }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .background(color = PrimaryColor),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.filter),
                    contentDescription = "Notification",
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.Center),
                    colorFilter = ColorFilter.tint(color = TextWhiteColor)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Box(
            modifier = Modifier
                .height(108.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp)),
        ) {
            Image(
                painter = painterResource(id = R.drawable.banner_background),
                contentDescription = "Banner Background",
                modifier = Modifier
                    .height(92.dp)
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                contentScale = ContentScale.FillBounds
            )
            Image(
                painter = painterResource(id = R.drawable.tom_banner),
                contentDescription = "Tom",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .height(108.dp)
            )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .height(92.dp)
                    .padding(12.dp),
                verticalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "Buy 1 Tom and get 2 for free",
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    color = TextWhiteColor,
                )
                Row {
                    Text(
                        text = "Adopt Tom! (Free Fail-Free Guarantee)",
                        fontFamily = IBMPlexSansArabic,
                        fontWeight = FontWeight.Normal,
                        fontSize = 12.sp,
                        color = TextWhiteColor.copy(alpha = 0.8f),
                        modifier = Modifier.weight(1f),
                    )
                    Box(modifier = Modifier.weight(1f))
                }
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "Cheap tom section",
                fontFamily = IBMPlexSansArabic,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = TextPrimaryColor,
            )
            Button(
                onClick = { },
                modifier = Modifier
                    .height(18.dp)
                    .width(60.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                contentPadding = PaddingValues(0.dp),
            ) {
                Text(
                    text = "View all",
                    fontFamily = IBMPlexSansArabic,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = TextAccentColor,
                )
                Spacer(Modifier.width(4.dp))
                Image(
                    painter = painterResource(id = R.drawable.arrow_right),
                    contentDescription = "Arrow Right",
                    modifier = Modifier.size(12.dp),
                    colorFilter = ColorFilter.tint(color = PrimaryColor),
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(tomItemsList.size) { index ->
                val tomItem = tomItemsList[index]
                Box(
                    modifier = Modifier
                        .height(235.dp)
                        .fillMaxWidth(),
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 16.dp)
                            .height(219.dp)
                            .clip(shape = RoundedCornerShape(16.dp))
                            .background(color = Color.White)
                            .align(Alignment.BottomStart)
                            .padding(horizontal = 8.dp)
                            .padding(top = 92.dp, bottom = 18.dp),
                    ) {
                        Text(
                            text = tomItem.title,
                            fontFamily = IBMPlexSansArabic,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 18.sp,
                            color = TextPrimaryColor,
                            textAlign = TextAlign.Center,
                            maxLines = 1,
                            modifier = Modifier.fillMaxWidth(),
                        )
                        Text(
                            text = tomItem.description,
                            fontFamily = IBMPlexSansArabic,
                            fontWeight = FontWeight.Normal,
                            fontSize = 12.sp,
                            color = TextSecondaryColor,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f),
                        )
                        Row(
                            modifier = Modifier.height(30.dp),
                        ) {
                            Button(
                                onClick = { },
                                modifier = Modifier
                                    .weight(1f)
                                    .height(30.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = LightBlue),
                                contentPadding = PaddingValues(vertical = 7.dp, horizontal = 10.dp),
                                shape = RoundedCornerShape(8.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.money_bag),
                                    contentDescription = "Add to cart",
                                    colorFilter = ColorFilter.tint(color = PrimaryColor),
                                    modifier = Modifier.height(16.dp)
                                )
                                Spacer(Modifier.width(4.dp))
                                if (tomItem.salePrice == 0)
                                    Text(
                                        text = tomItem.price.toString(),
                                        fontFamily = IBMPlexSansArabic,
                                        fontWeight = FontWeight.Medium,
                                        fontSize = 12.sp,
                                        lineHeight = 16.sp,
                                        color = TextAccentColor,
                                    )
                                if (tomItem.salePrice != 0)
                                    Text(
                                        text = tomItem.price.toString(),
                                        fontFamily = IBMPlexSansArabic,
                                        fontWeight = FontWeight.Medium,
                                        fontSize = 12.sp,
                                        lineHeight = 16.sp,
                                        textDecoration = TextDecoration.LineThrough,
                                        color = TextAccentColor,
                                    )
                                if (tomItem.salePrice != 0)
                                    Spacer(Modifier.width(2.dp))
                                if (tomItem.salePrice != 0)
                                    Text(
                                        text = tomItem.salePrice.toString(),
                                        fontFamily = IBMPlexSansArabic,
                                        fontWeight = FontWeight.Medium,
                                        fontSize = 12.sp,
                                        lineHeight = 16.sp,
                                        color = TextAccentColor,
                                    )
                                Spacer(Modifier.width(2.dp))
                                Text(
                                    text = "cheeses",
                                    fontFamily = IBMPlexSansArabic,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    overflow = TextOverflow.Ellipsis,
                                    color = TextAccentColor,
                                )
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(
                                onClick = { },
                                modifier = Modifier.size(30.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                                contentPadding = PaddingValues(0.dp),
                                shape = RoundedCornerShape(8.dp),
                                border = BorderStroke(width = 1.dp, color = PrimaryColor),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.add_to_cart),
                                    contentDescription = "Add to cart",
                                    colorFilter = ColorFilter.tint(color = PrimaryColor),
                                    modifier = Modifier.size(16.dp),
                                )
                            }
                        }
                    }
                    Image(
                        painter = painterResource(id = tomItem.imageId),
                        contentDescription = "Tom",
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .height(100.dp)
                    )
                }
            }
        }
    }
}

@Preview(widthDp = 360, heightDp = 772)
@Composable
fun Screen1Preview() {
    Screen1()
}

val tomItemsList = listOf(
    TomItemModel(
        imageId = R.drawable.tom_item_1,
        title = "Sport Tom",
        description = "He runs 1 meter... trips over his boot.",
        price = 5,
        salePrice = 3,
    ),
    TomItemModel(
        imageId = R.drawable.tom_item_2,
        title = "Tom the lover",
        description = "He loves one-sidedly... and is beaten by the other side and is beaten by the other side and is beaten by the other side.",
        price = 5,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.tom_item_3,
        title = "Tom the bomb",
        description = "He blows himself up before Jerry can catch him.",
        price = 10,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.tom_item_4,
        title = "Spy Tom",
        description = "Disguises itself as a table.",
        price = 12,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.tom_item_5,
        title = "Frozen Tom",
        description = "He was chasing Jerry, he froze after the first look",
        price = 10,
        salePrice = 0,
    ),
    TomItemModel(
        imageId = R.drawable.tom_item_6,
        title = "Sleeping Tom",
        description = "He doesn't chase anyone, he just snores in stereo.",
        price = 10,
        salePrice = 0,
    ),
)