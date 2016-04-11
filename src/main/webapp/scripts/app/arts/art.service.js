(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('ArtService',ArtService);

  /** @ngInject */
  function ArtService($q,$http){
    var artService = [];

    artService.getArts = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
     /* var d = $q.defer();
      d.resolve({'data':arts});
      return d.promise;*/
    };
    artService.getShows = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    };
    artService.getNews = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
     /* var d = $q.defer();
      d.resolve({'data':news});
      return d.promise;*/
    }


    return artService;
  }
})();

