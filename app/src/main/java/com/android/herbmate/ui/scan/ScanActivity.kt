package com.android.herbmate.ui.scan

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.android.herbmate.R
import com.android.herbmate.ui.detail.DetailActivity
import com.yalantis.ucrop.UCrop
import java.io.File

class ScanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)


//        binding.btnLong.setOnClickListener {
//            val intent = Intent(requireActivity(), DetailActivity::class.java)
//            startActivity(intent)
//        }
//
//        binding.btn1.setOnClickListener {
//            startGallery()
//        }

//        binding.btnLong.setOnClickListener {
//            analyzeImage()
//        }
    }

//    private fun startGallery() {
//        launcherGallery.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
//    }
//
//    private val launcherGallery = registerForActivityResult(
//        ActivityResultContracts.PickVisualMedia()
//    ) { uri: Uri? ->
//        if (uri != null) {
//            homeViewModel.croppedImageUri = uri
//            startCrop(uri)
//        }else{
//            binding.btn1.isEnabled = false
//        }
//    }
//
//    private fun startCrop(uri: Uri) {
//        val destinationUri = Uri.fromFile(File(requireContext().cacheDir, "croppedImage_${System.currentTimeMillis()}.jpg"))
//        val cropIntent = UCrop.of(uri, destinationUri).getIntent(requireContext())
//        cropActivityLauncher.launch(cropIntent)
//    }
//
//    private val cropActivityLauncher = registerForActivityResult(
//        ActivityResultContracts.StartActivityForResult()
//    ) { result ->
//        if (result.resultCode == RESULT_OK) {
//            val resultUri = UCrop.getOutput(result.data!!)
//            resultUri?.let {
//                homeViewModel.croppedImageUri = it
//                showImage(it)
//                binding.btnLong.isEnabled = true
//            }
//        } else if (result.resultCode == UCrop.RESULT_ERROR) {
//            val cropError = UCrop.getError(result.data!!)
//            showToast("Crop error: ${cropError?.message}")
//        } else if (result.resultCode == RESULT_CANCELED) {
//            // Cropping dibatalkan
//            homeViewModel.croppedImageUri = null
//            showToast("Cropping canceled")
//            binding.btnLong.isEnabled = false
//        }
//    }
//
//
//    private fun showImage(uri: Uri) {
//        binding.imgPlant.setImageURI(uri)
//    }

//    private fun analyzeImage() {
//        homeViewModel.croppedImageUri?.let { uri ->
//            val imageClassifierHelper = ImageClassifierHelper(
//                context = requireContext(),
//                classifierListener = object : ImageClassifierHelper.ClassifierListener {
//                    override fun onError(error: String) {
//                        showToast("Error: $error")
//                    }
//
//                    override fun onResults(results: List<Classifications>?) {
//                        if (!results.isNullOrEmpty()) {
//                            val topResult = results[0].categories[0]
//                            val scorePercentage = (topResult.score * 100).toInt()
//                            val resultText = "${topResult.label} : $scorePercentage%"
//
//                            moveToResult(uri, resultText)
//                        } else {
//                            showToast("No results found.")
//                        }
//                    }
//
//                    override fun onModelLoad(numClasses: Int) {
//                        showToast("Model loaded with $numClasses classes")
//                    }
//                }
//            )
//
//            imageClassifierHelper.classifyStaticImage(uri)
//
//        } ?: showToast("No image selected")
//    }

//    private fun moveToResult(uri: Uri, resultText: String) {
//        val intent = Intent(context, DetailActivity::class.java).apply {
//            putExtra(DetailActivity.EXTRA_NAME, uri.toString())
//            putExtra(DetailActivity.EXTRA_IMAGE, resultText)
//        }
//        startActivity(intent)
//    }
//
//    private fun showToast(message: String) {
//        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
//    }
}