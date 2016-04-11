(function() {
  'use strict';

  angular
    .module('frontTvWeb')
    .controller('TvController',TvController);

  /** @ngInject */
  function TvController( $modal, MainService, TvService,$log) {
    var vm = this;

    vm.carouselData = {
      'type':'carouselBg',
      'number':3
    };

    vm.oldData = {
      'type':'oldMovie',
      'number':6
    };
    vm.loveData = {
      'type':'likeMovie',
      'number':9
    };
    /*获取轮播数据*/
    MainService.getCarouse(vm.carouselData).then(function(result){
     vm.slides = result.data.data;
    },function(err){
      $log.error(err.statusText +':'+ err.status);
    });

    /*获取热播数据*/
    TvService.getHots().then(function(result){
      vm.hot_tvs = result.data;
    },function(err){
      $log.error(err.statusText +':'+ err.status);
    });

    /*获取精选数据*/
    TvService.getSelects().then(function(result){
      vm.selects = result.data;
    },function(err){
      $log.error(err.statusText +':'+ err.status);
    });

    /*精选电影*/
    MainService.getOld(vm.oldData).then(function(result){
      vm.choiceMovies = result.data.data;
    },function(err){
      $log.error(err.statusText + ':'+err.status);
    });

    /*爱情剧*/
    TvService.getLove(vm.loveData).then(function(result){
      vm.tvDatas = result.data.data;
    },function(err){
      $log.error(err.status + ':' +err.statusText);
    });

  } //End of MainController

})();
