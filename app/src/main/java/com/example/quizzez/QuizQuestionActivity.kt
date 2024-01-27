package com.example.quizzez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionActivity : AppCompatActivity() {

    private var progressBar: ProgressBar? = null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var ivImage: ImageView? = null

    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        // binding the view elements
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.questionCount)
        tvQuestion = findViewById(R.id.questionTextView)
        ivImage = findViewById(R.id.questionImageView)

        tvOptionOne = findViewById(R.id.optionOne)
        tvOptionTwo = findViewById(R.id.optionTwo)
        tvOptionThree = findViewById(R.id.optionThree)
        tvOptionFour = findViewById(R.id.optionFour)

        val questions = Constants.getQuestions()

        var currentIndex = 3

        val question = questions[currentIndex-1]

        tvQuestion?.text = question.question
        progressBar?.progress = currentIndex
        tvProgress?.text = "${currentIndex} / ${progressBar?.max}"

        ivImage?.setImageResource(question.image)

        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour
    }
}