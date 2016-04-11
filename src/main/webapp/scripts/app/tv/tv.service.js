(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('TvService',TvService);

  /** @ngInject */
  function TvService($q,$http){
    var tvService = [];

    var tvs = [
      {
        image:'/assets/images/tv/01.jpg',
        message:'aa',
        id:1
      },
      {
        image:'/assets/images/tv/02.jpg',
        message:'aa',
        id:2
      },
      {
        image:'/assets/images/tv/03.jpg',
        message:'aa',
        id:3
      },
      {
        image:'/assets/images/tv/04.jpg',
        message:'aa',
        id:4
      },
      {
        image:'/assets/images/tv/05.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/tv/06.jpg',
        message:'aa',
        id:6
      },
      {
        image:'/assets/images/tv/07.jpg',
        message:'aa',
        id:7
      },
      {
        image:'/assets/images/tv/08.jpg',
        message:'aa',
        id:8
      },
      {
        image:'/assets/images/tv/09.jpg',
        message:'aa',
        id:9
      },
      {
        image:'/assets/images/tv/05.jpg',
        message:'aa',
        id:10
      },
      {
        image:'/assets/images/tv/04.jpg',
        message:'aa',
        id:11
      },
      {
        image:'/assets/images/tv/03.jpg',
        message:'aa',
        id:12
      }
    ];
    var select = [
      {
        image:'/assets/images/tv/01.jpg',
        message:'aa',
        id:1
      },
      {
        image:'/assets/images/tv/02.jpg',
        message:'aa',
        id:2
      },
      {
        image:'/assets/images/tv/03.jpg',
        message:'aa',
        id:3
      },
      {
        image:'/assets/images/tv/04.jpg',
        message:'aa',
        id:4
      },
      {
        image:'/assets/images/tv/05.jpg',
        message:'aa',
        id:5
      },
      {
        image:'/assets/images/tv/06.jpg',
        message:'aa',
        id:6
      }
    ];


    tvService.getHots = function(){
      var d = $q.defer();
      d.resolve({'data':tvs});
      return d.promise;
    };
    tvService.getSelects = function(){
      var d = $q.defer();
      d.resolve({'data':select});
      return d.promise;
    };
    tvService.getLove = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
      /*var d = $q.defer();
      d.resolve({'data':loveDatas});
      return d.promise;*/
    }

    return tvService;
  }
})();

