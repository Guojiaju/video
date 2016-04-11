(function() {
  'use strict';
  /**
   * Created by Administrator on 2016/3/22.
   * auth:xzc
   */
  angular
    .module('frontTvWeb')
    .service('MainService',MainService);

  /** @ngInject */
  function MainService($q,$http){
    var mainService = [];

    /*轮播数据获取*/
    mainService.getCarouse = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    }


  /*  mainService.getCarouse = function(){
      var d = $q.defer();
      d.resolve({'data':slides});
      return d.promise;
    };*/

    /*获取你可能喜欢的*/
    mainService.getLike = function(data){
      return $http({
        method:"POST",
        url:"http://localhost:8080/end_tv_web/movieAction/getMovies",
        data:data
      });
    /*  var d = $q.defer();
      d.resolve({'data':like});
      return d.promise;*/
    };
    mainService.getLiquid = function(data){
      return $http({
        method: "POST",
        url: "http://localhost:8080/end_tv_web/movieAction/getMovies",
        data: data
      });
     /* var d = $q.defer();
      d.resolve({'data':liquids});
      return d.promise;*/
    };
    mainService.getOld = function(data){
      return $http({
        method: "POST",
        url: "http://localhost:8080/end_tv_web/movieAction/getMovies",
        data: data
      });
    };
    mainService.getMovies = function(data){
      return $http({
        method: "POST",
        url: "http://localhost:8080/end_tv_web/movieAction/getMovies",
        data: data
      });
    }
    mainService.getTvShow = function(type){
      var data = {
        'type':type,
        'number':9
      }
      return $http({
        method: "POST",
        url: "http://localhost:8080/end_tv_web/movieAction/getMovies",
        data: data
      });
    /*  var datas =[];
      angular.forEach(tvDatas, function(value){
        if(value.type == type){
          console.log(value.type);
          datas.push(value);
        }
      });
      var d = $q.defer();
      d.resolve({'data':datas});
      return d.promise;*/
    }

    return mainService;
  }
})();

