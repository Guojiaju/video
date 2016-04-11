(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('AnimationController',AnimationController);

  /** @ngInject */
  function AnimationController( $modal, AnimationService,$log) {
    var vm = this;

    vm.animationCarousel={
      'type':'animationCarousel',
      'number':7
    };
    vm.newAnimationData = {
      'type':'newAnimation',
      'number':12
    };
    vm.popularAnimationData = {
      'type': 'popularAnimation',
      'number':9
    };
    vm.japanAnimationData = {
      'type':'popularAnimation',
      'number':12
    };
    vm.chinaAnimationData = {
      'type':'popularAnimation',
      'number':12
    };
    vm.famousAnimationData = {
      'type':'popularAnimation',
      'number':6
    };
    vm.movieAnimationData = {
      'type':'popularAnimation',
      'number':12
    };
    vm.classicAnimationData = {
      'type':'popularAnimation',
      'number':12
    };
    /*头部轮播*/
    AnimationService.getCarousels(vm.animationCarousel).then(function(result){
      vm.lgAnimations = result.data.data;
    },function(err){
      $log.error(err.status + ':' +err.statusText);
    });

    /*获取新番*/
    AnimationService.getNewAnimations(vm.newAnimationData).then(function(result){
      vm.newAnimations = result.data.data;
    },function(err){
      $log.error(err.status +':'+err.statusText);
    });

    /*热门动漫*/
    AnimationService.getPopular(vm.popularAnimationData).then(function(result){
      vm.popularDatas = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });
    AnimationService.getJapanAnimation(vm.japanAnimationData).then(function(result){
      vm.japanAnimation = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });
    AnimationService.getChinaAnimation(vm.chinaAnimationData).then(function(result){
      vm.chinaAnimation = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });
    AnimationService.getFamousAnimation(vm.famousAnimationData).then(function(result){
      vm.famousAnimation = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });
    AnimationService.getMovieAnimation(vm.movieAnimationData).then(function(result){
      vm.movieAnimation = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });
    AnimationService.getClassicAnimation(vm.classicAnimationData).then(function(result){
      vm.classicAnimation = result.data.data;
    },function(err){
      $log.error(err.status + ':'+err.statusText);
    });
  } //End of MainController

})();
