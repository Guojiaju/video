(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('MovieService',MovieService);

  /** @ngInject */
  function MovieService($q,$http){
    var movieService = [];

    movieService.getMovies = function(data){
      return $http({
        method: "POST",
        url: "http://localhost:8080/end_tv_web/movieAction/getMovies",
        data: data
      });
      /*var d = $q.defer();
      d.resolve({'data':movies});
      return d.promise;*/
    }

    return movieService;
  }
})();

