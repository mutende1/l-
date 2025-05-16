
package com.example.bizeasy.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bizeasy.ui.notes.AddNotesScreen
import com.bizeasy.ui.notes.UpdateNotesScreen


import com.example.bizeasy.screens.MITInnovationsContentScreen


import com.example.bizeasy.screens.androiddevelopment.AndroidDevelopmentTopicsScreen
import com.example.bizeasy.screens.androidintroductioncontent.AndroidIntroductionContentsScreen

import com.example.bizeasy.screens.androidstudioandsetup.AndroidStudioAndSetupContentScreen
import com.example.bizeasy.screens.androidstudioandsetup.AndroidStudioAndSetupContentScreen

import com.example.bizeasy.screens.basicuicomponentsinandroid.BasicUiComponentsInAndroidContentScreen

import com.example.bizeasy.screens.cloudcomputingtopic.CloudComputingTopicsScreen
import com.example.bizeasy.screens.cybersecurityethics.CybersecurityEthicsContentScreen
import com.example.bizeasy.screens.datascience.DataScienceTopicsScreen
import com.example.bizeasy.screens.datastructuresalgorithms.DataStructuresAlgorithmsContentScreen
import com.example.bizeasy.screens.datavisualization.DataVisualizationContentScreen
import com.example.bizeasy.screens.machinelearning.MachineLearningFundamentalsContentScreen
import com.example.bizeasy.screens.mitintroduction.MITIntroductionContentScreen
import com.example.bizeasy.screens.mitresearchareas.MITResearchAreasContentScreen
import com.example.bizeasy.screens.networksecurity.NetworkSecurityContentScreen

import com.example.bizeasy.screens.pandasdataanalysis.PandasDataAnalysisContentScreen
import com.example.bizeasy.screens.programminglanguagefundamentalcontent.ProgrammingLanguagesFundamentalsContentScreen
import com.example.bizeasy.screens.pythonfordatascience.PythonForDataScienceContentScreen
import com.example.bizeasy.screens.softwaredevelopment.SoftwareDevelopmentTopicsScreen
import com.example.bizeasy.screens.softwaredevelopmentmethodoligies.SoftwareDevelopmentMethodologiesContentScreen
import com.example.bizeasy.screens.systemsecurity.SystemSecurityContentScreen
import androidx.navigation.compose.rememberNavController
import com.example.bizeasy.screens.cloudcomputingintroductioncontent.CloudComputingIntroductionContentScreen

import com.example.bizeasy.screens.cloudservicemodels.CloudServiceModelsScreen
import com.example.bizeasy.screens.majorcloudproviders.MajorCloudProvidersContentScreen
import com.example.bizeasy.screens.softwareintroduction.IntroductionToSoftwareDevelopmentContentScreen

import com.example.bizeasy.ui.theme.screens.SplashScreen

import com.example.bizeasy.ui.theme.screens.cybersecuritytopic.CybersecurityTopicScreen

import com.example.bizeasy.ui.theme.screens.cybersecuritytopic.PhishingFundamentalsContentScreen
import com.example.bizeasy.ui.theme.screens.dashboard.DashboardScreen
import com.example.bizeasy.ui.theme.screens.datascience.DataScienceIntroductionContentScreen
import com.example.bizeasy.ui.theme.screens.login.LoginScreen
import com.example.bizeasy.ui.theme.screens.mit.MITTopicsScreen
import com.example.bizeasy.ui.theme.screens.note.ViewNotesScreen




import com.example.bizeasy.ui.theme.screens.register.RegisterScreen

import okhttp3.Route


@Composable
fun AppNavHost(navController:NavHostController = rememberNavController(),startDestination:String= ROUTE_SPLASH) {
    NavHost(navController = navController, startDestination = startDestination) {
//        composable(
//            ROUTE_UPDATE_NOTE,
//            arguments =
//                listOf(navArgument("noteId") {type =
//                    NavType.StringType})
//        ) { backStackEntry ->
//            val noteId =
//                backStackEntry.arguments?.getString("noteId")
//            UpdateNotesScreen(
//                navController =
//                    navController, noteId = noteId)
//        }
//
        composable(ROUTE_ADD_NOTE) {
            AddNotesScreen(navController = navController)
        }
//        composable(
//            ROUTE_VIEW_NOTE,
//            arguments =
//                listOf(navArgument("noteId") {type =
//                    NavType.StringType})
//        ) { backStackEntry ->
//            val noteId =
//                backStackEntry.arguments?.getString("noteId")
//            ViewNotesScreen(
//                navController =
//                    navController, noteId = noteId)
//        }
//



        composable(ROUTE_SPLASH) {
            SplashScreen {
                navController.navigate(ROUTE_REGISTER) {
                    popUpTo(ROUTE_SPLASH) { inclusive = true }
                }
            }
        }
        composable(ROUTE_REGISTER) { RegisterScreen(navController) }
        composable(ROUTE_LOGIN) { LoginScreen(navController) }
        composable("phishing_fundamentals_content") {
            PhishingFundamentalsContentScreen()
        }
        composable(ROUTE_DATA_SCIENCE_TOPICS) {
            DataScienceTopicsScreen(navController)
        }
        composable(ROUTE_ANDROID_DEVELOPMENT_TOPICS) {
            AndroidDevelopmentTopicsScreen(navController)
        }
        composable(ROUTE_PROGRAMMING_LANGUAGES_FUNDAMENTALS_CONTENT) {
            ProgrammingLanguagesFundamentalsContentScreen()
        }
        composable(ROUTE_SOFTWARE_DEVELOPMENT_TOPICS) {
            SoftwareDevelopmentTopicsScreen(navController)
        }
        composable(ROUTE_CLOUD_COMPUTING_TOPICS) {
            CloudComputingTopicsScreen(navController)
        }
        composable(ROUTE_DATA_SCIENCE_INTRODUCTION_CONTENT) {
            DataScienceIntroductionContentScreen()
        }
        composable(ROUTE_PYTHON_FOR_DATA_SCIENCE_CONTENT) {
            PythonForDataScienceContentScreen()
        }
        composable(ROUTE_PANDAS_DATA_ANALYSIS_CONTENT) {
            PandasDataAnalysisContentScreen()
        }
      composable (ROUTE_CLOUD_COMPUTING_INTRODUCTION_CONTENT){
          CloudComputingIntroductionContentScreen()
      }
        composable (ROUTE_CLOUD_SERVICE_MODELS_SCREEN){
            CloudServiceModelsScreen()
        }
        composable (ROUTE_MAJOR_CLOUD_PROVIDERS_CONTENT) {
            MajorCloudProvidersContentScreen()
        }



        composable(ROUTE_DATA_VISUALIZATION_CONTENT) {
            DataVisualizationContentScreen()
        }



        composable(ROUTE_MACHINE_LEARNING_FUNDAMENTALS_CONTENT) {
            MachineLearningFundamentalsContentScreen()
        }
        composable(ROUTE_MIT_TOPICS) {
            MITTopicsScreen(navController = navController)
        }
        composable(ROUTE_MIT_INTRODUCTION_CONTENT) {
            MITIntroductionContentScreen()
        }
        composable(ROUTE_MIT_RESEARCH_AREAS_CONTENT) {
            MITResearchAreasContentScreen()
        }
        composable(ROUTE_MIT_INNOVATIONS_CONTENT) {
            MITInnovationsContentScreen()
        }
        composable(ROUTE_SOFTWARE_DEVELOPMENT_METHODOLOGIES_CONTENT) {
            SoftwareDevelopmentMethodologiesContentScreen()
        }
        composable(ROUTE_DATA_STRUCTURES_ALGORITHMS_CONTENT) {
            DataStructuresAlgorithmsContentScreen()
        }
        composable(ROUTE_ANDROID_INTRODUCTION_CONTENT) {
            AndroidIntroductionContentsScreen()
        }
        composable(ROUTE_ANDROID_STUDIO_SETUP_CONTENT) {
            AndroidStudioAndSetupContentScreen()
        }
        composable(ROUTE_CYBERSECURITY_TOPICS) {
            CybersecurityTopicScreen(navController)
        }


//        composable(ROUTE_ADD_NOTE) {
//            AddNotesScreen(navController)
//        }
////                onNoteAdded = { title, content ->
////                    println("Adding note: $title, $content")
////                    navController.popBackStack()
////                },
////                onNavigateBack = { navController.popBackStack() }
////            )
////        }
////        composable (ROUTE_VIEW_NOTE){
////            ViewNotesScreen(navController) {}
////        }
//        composable (ROUTE_UPDATE_NOTE){
//            UpdateNotesScreen(navController){}
//        }
//        composable(
//            route = ROUTE_VIEW_NOTE,
//            arguments = listOf(navArgument("noteId") { type = NavType.StringType })
//        ) { backStackEntry ->
//            val noteId = backStackEntry.arguments?.getString("noteId")
//            ViewNotesScreen( // Calling the ViewNoteScreen composable function
//                noteId = noteId,
//                onNavigateBack = { navController.popBackStack() }
//            )
//        }
       composable (ROUTE_INTRODUCTION_TO_SOFTWARE_DEVELOPMENT_CONTENT_SCREEN){
           IntroductionToSoftwareDevelopmentContentScreen()
       }
        composable(ROUTE_BASIC_UI_COMPONENTS_IN_ANDROID_CONTENT_SCREEN) {
            BasicUiComponentsInAndroidContentScreen()
        }
        composable(ROUTE_CYBER_SECURITY_ETHICS_CONTENT) { CybersecurityEthicsContentScreen() }
        composable(ROUTE_NETWORK_SECURITY_CONTENT) { NetworkSecurityContentScreen() }
        composable("system_security_content") {
            SystemSecurityContentScreen()
        }
        composable(ROUTE_DASHBOARD) { DashboardScreen(navController) }

//       composable (ROUTE_BASIC_UI_COMPONENTS_IN_ANDROID){
//           BasicUiComponentsInAndroidContentScreen()
//       }


    }

}

