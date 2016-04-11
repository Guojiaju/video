(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('AnimationService',AnimationService);

  /** @ngInject */
  function AnimationService($q,$http){
    var animationService = [];


    var chinaData = [
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:1
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:2
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:3
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:4
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      }
    ];
    var famousData = [
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:1
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:2
      },
      {
        image:'/assets/images/animation/b3.jpg',
        message:'aa',
        id:3
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:4
      },
      {
        image:'/assets/images/animation/b1.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      }
    ];
    var movieData = [
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:1
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:2
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:3
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:4
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b2.jpg',
        message:'aa',
        id:5
      }
    ];
    var classicData = [
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:1
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:2
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:3
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:4
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/animation/b4.jpg',
        message:'aa',
        id:5
      }
    ];
    animationService.getCarousels = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
      /*var d = $q.defer();
      d.resolve({'data':animations});
      return d.promise;*/
    };
    animationService.getNewAnimations = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    animationService.getPopular = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    animationService.getJapanAnimation = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    animationService.getChinaAnimation = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    animationService.getFamousAnimation = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    animationService.getMovieAnimation = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    animationService.getClassicAnimation = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
     /* var d = $q.defer();
      d.resolve({'data':classicData});
      return d.promise;*/
    };
    return animationService;
  }
})();

