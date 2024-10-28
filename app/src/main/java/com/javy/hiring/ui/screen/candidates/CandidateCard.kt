package com.javy.hiring.ui.screen.candidates

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javy.hiring.R
import com.javy.hiring.ui.model.Candidate

@Composable
fun CandidateCard(
    candidate: Candidate
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 12.dp, top = 6.dp, end = 12.dp, bottom = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp)
        ) {
            Column {
                LabelAndValue(stringResource(R.string.name_label), candidate.name)
                LabelAndValue(stringResource(R.string.list_id_label), candidate.listId.toString())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CandidateCardPreview() {
    CandidateCard(
        Candidate(
            id = 1,
            name = "Jane Doe",
            listId = 3
        )
    )
}

@Preview(showBackground = true)
@Composable
fun LabelAndValuePreview() {
    LabelAndValue("List ID:", "Value")
}

@Composable
fun LabelAndValue(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = label,
            modifier = Modifier
                .weight(.2f)
                .wrapContentWidth(Alignment.End)
        )
        Text(
            text = value,
            modifier = Modifier
                .padding(start = 12.dp)
                .weight(1f)
        )
    }
}