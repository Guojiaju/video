(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .config(routerConfig);

  /** @ngInject */
  function routerConfig($stateProvider, $urlRouterProvider) {
    $stateProvider
      .state('login',{
        url:'/login',
        templateUrl:'app/login/login.html',
        controller:'LoginController',
        controllerAs:'login'
      })
      .state('nav', {
        abstract:true,
        url: '/',
        templateUrl: 'app/components/navbar/total.html'
      })
      .state('nav.main', {
        url: 'main',
        templateUrl: 'app/main/main.html',
        controller: 'MainController',
        controllerAs: 'main'
      })
      .state('nav.tv', {
        url:'tv',
        templateUrl: 'app/tv/tv.html',
        controller: 'TvController',
        controllerAs: 'tv'
      })
      .state('nav.movie', {
        url:'movie',
        templateUrl: 'app/movie/movie.html',
        controller: 'MovieController',
        controllerAs: 'movie'
      })
      .state('nav.art', {
        url:'art',
        templateUrl: 'app/arts/art.html',
        controller: 'ArtController',
        controllerAs: 'art'
      })
      .state('nav.animation', {
        url:'animation',
        templateUrl: 'app/animation/animation.html',
        controller: 'AnimationController',
        controllerAs: 'animation'
      })
      .state('nav.fitness', {
        url:'fitness',
        templateUrl: 'app/fitness/fitness.html',
        controller: 'FitnessController',
        controllerAs: 'fit'
      })
      .state('nav.teach', {
        url:'teach',
        templateUrl: 'app/teach/teach.html',
        controller: 'TeachController',
        controllerAs: 'teach'
      })
      .state('nav.tvSort', {
        url:'tvSort',
        templateUrl: 'app/tvSort/tvSort.html',
        controller: 'TvSortController',
        controllerAs: 'tvSort'
      })
      .state('nav.movieSort', {
        url:'movieSort',
        templateUrl: 'app/movieSort/movieSort.html',
        controller: 'MovieSortController',
        controllerAs: 'movieSort'
      })
      .state('nav.artsSort', {
        url:'artsSort',
        templateUrl: 'app/artsSort/artsSort.html',
        controller: 'ArtsSortController',
        controllerAs: 'artsSort'
      })
      .state('nav.animationSort', {
        url:'animationSort',
        templateUrl: 'app/animationSort/animationSort.html',
        controller: 'AnimationSortController',
        controllerAs: 'animationSort'
      })
      .state('nav.fitnessSort', {
        url:'fitnessSort',
        templateUrl: 'app/fitnessSort/fitnessSort.html',
        controller: 'FitnessSortController',
        controllerAs: 'fitnessSort'
      })
      .state('nav.teachSort', {
        url:'teachSort',
        templateUrl: 'app/teachSort/teachSort.html',
        controller: 'TeachSortController',
        controllerAs: 'teachSort'
      })
      .state('nav.play', {
        url:'play',
        templateUrl: 'app/play/play.html',
        controller: 'PlayController',
        controllerAs: 'play'
      })
      .state('nav.message', {
        url:'message',
        templateUrl:'app/message/message.html',
        controller: 'MessageController',
        controllerAs: 'message'
      })
      .state('nav.personalCenter', {
        url:'personal',
        templateUrl:'app/userCenter/personalCenter.html',
        controller:'UserCenterController',
        controllerAs:'center'
      })
      .state('nav.upload', {
        url:'upload',
        templateUrl:'app/userCenter/upload.html',
        controller:'UserCenterController',
        controllerAs:'upload'
      })
      .state('end', {
        abstract:true,
        url: '/',
        templateUrl: 'app/end/end_index.html'
      })
      .state('end.main', {
        url:'endMain',
        templateUrl:'app/end/main/end_main.html',
        controller:'EndMainController',
        controllerAs:'endMain'
      });
     /* .state('modal',{
        onEnter: ['$stateParams', '$state', '$modal', function($stateParams, $state,$modal){
          $modal.open({
            templateUrl:'app/components/navbar/modal.html',
            controller:'NewModalController',
            controllerAs: 'modal',
            animation: true,
            size: 'lg',
          }).result.then(function(){

            },function(){
              $state.go('nav.main');
            });
        }],

      });*/

    $urlRouterProvider.otherwise('main');
  }

})();
