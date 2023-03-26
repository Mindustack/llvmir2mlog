; ModuleID = 'test3.cpp'
source_filename = "test3.cpp"
target datalayout = "e-m:e-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%union.header = type { %struct.anon }
%struct.anon = type { %union.header*, i32 }

@_ZL5freep = internal global %union.header* null, align 8
@_ZL4base = internal global %union.header zeroinitializer, align 8

; Function Attrs: noinline optnone uwtable
define dso_local i8* @_Z6mallocj(i32 %0) #0 {
  %2 = alloca i8*, align 8
  %3 = alloca i32, align 4
  %4 = alloca %union.header*, align 8
  %5 = alloca %union.header*, align 8
  %6 = alloca i32, align 4
  store i32 %0, i32* %3, align 4
  %7 = load i32, i32* %3, align 4
  %8 = zext i32 %7 to i64
  %9 = add i64 %8, 16
  %10 = sub i64 %9, 1
  %11 = udiv i64 %10, 16
  %12 = add i64 %11, 1
  %13 = trunc i64 %12 to i32
  store i32 %13, i32* %6, align 4
  %14 = load %union.header*, %union.header** @_ZL5freep, align 8
  store %union.header* %14, %union.header** %5, align 8
  %15 = icmp eq %union.header* %14, null
  br i1 %15, label %16, label %17

16:                                               ; preds = %1
  store %union.header* @_ZL4base, %union.header** %5, align 8
  store %union.header* @_ZL4base, %union.header** @_ZL5freep, align 8
  store %union.header* @_ZL4base, %union.header** getelementptr inbounds (%union.header, %union.header* @_ZL4base, i32 0, i32 0, i32 0), align 8
  store i32 0, i32* getelementptr inbounds (%union.header, %union.header* @_ZL4base, i32 0, i32 0, i32 1), align 8
  br label %17

17:                                               ; preds = %16, %1
  %18 = load %union.header*, %union.header** %5, align 8
  %19 = bitcast %union.header* %18 to %struct.anon*
  %20 = getelementptr inbounds %struct.anon, %struct.anon* %19, i32 0, i32 0
  %21 = load %union.header*, %union.header** %20, align 8
  store %union.header* %21, %union.header** %4, align 8
  br label %22

22:                                               ; preds = %78, %17
  %23 = load %union.header*, %union.header** %4, align 8
  %24 = bitcast %union.header* %23 to %struct.anon*
  %25 = getelementptr inbounds %struct.anon, %struct.anon* %24, i32 0, i32 1
  %26 = load i32, i32* %25, align 8
  %27 = load i32, i32* %6, align 4
  %28 = icmp uge i32 %26, %27
  br i1 %28, label %29, label %67

29:                                               ; preds = %22
  %30 = load %union.header*, %union.header** %4, align 8
  %31 = bitcast %union.header* %30 to %struct.anon*
  %32 = getelementptr inbounds %struct.anon, %struct.anon* %31, i32 0, i32 1
  %33 = load i32, i32* %32, align 8
  %34 = load i32, i32* %6, align 4
  %35 = icmp eq i32 %33, %34
  br i1 %35, label %36, label %44

36:                                               ; preds = %29
  %37 = load %union.header*, %union.header** %4, align 8
  %38 = bitcast %union.header* %37 to %struct.anon*
  %39 = getelementptr inbounds %struct.anon, %struct.anon* %38, i32 0, i32 0
  %40 = load %union.header*, %union.header** %39, align 8
  %41 = load %union.header*, %union.header** %5, align 8
  %42 = bitcast %union.header* %41 to %struct.anon*
  %43 = getelementptr inbounds %struct.anon, %struct.anon* %42, i32 0, i32 0
  store %union.header* %40, %union.header** %43, align 8
  br label %62

44:                                               ; preds = %29
  %45 = load i32, i32* %6, align 4
  %46 = load %union.header*, %union.header** %4, align 8
  %47 = bitcast %union.header* %46 to %struct.anon*
  %48 = getelementptr inbounds %struct.anon, %struct.anon* %47, i32 0, i32 1
  %49 = load i32, i32* %48, align 8
  %50 = sub i32 %49, %45
  store i32 %50, i32* %48, align 8
  %51 = load %union.header*, %union.header** %4, align 8
  %52 = bitcast %union.header* %51 to %struct.anon*
  %53 = getelementptr inbounds %struct.anon, %struct.anon* %52, i32 0, i32 1
  %54 = load i32, i32* %53, align 8
  %55 = load %union.header*, %union.header** %4, align 8
  %56 = zext i32 %54 to i64
  %57 = getelementptr inbounds %union.header, %union.header* %55, i64 %56
  store %union.header* %57, %union.header** %4, align 8
  %58 = load i32, i32* %6, align 4
  %59 = load %union.header*, %union.header** %4, align 8
  %60 = bitcast %union.header* %59 to %struct.anon*
  %61 = getelementptr inbounds %struct.anon, %struct.anon* %60, i32 0, i32 1
  store i32 %58, i32* %61, align 8
  br label %62

62:                                               ; preds = %44, %36
  %63 = load %union.header*, %union.header** %5, align 8
  store %union.header* %63, %union.header** @_ZL5freep, align 8
  %64 = load %union.header*, %union.header** %4, align 8
  %65 = getelementptr inbounds %union.header, %union.header* %64, i64 1
  %66 = bitcast %union.header* %65 to i8*
  store i8* %66, i8** %2, align 8
  br label %84

67:                                               ; preds = %22
  %68 = load %union.header*, %union.header** %4, align 8
  %69 = load %union.header*, %union.header** @_ZL5freep, align 8
  %70 = icmp eq %union.header* %68, %69
  br i1 %70, label %71, label %77

71:                                               ; preds = %67
  %72 = load i32, i32* %6, align 4
  %73 = call %union.header* @_Z8morecorej(i32 %72)
  store %union.header* %73, %union.header** %4, align 8
  %74 = icmp eq %union.header* %73, null
  br i1 %74, label %75, label %76

75:                                               ; preds = %71
  store i8* null, i8** %2, align 8
  br label %84

76:                                               ; preds = %71
  br label %77

77:                                               ; preds = %76, %67
  br label %78

78:                                               ; preds = %77
  %79 = load %union.header*, %union.header** %4, align 8
  store %union.header* %79, %union.header** %5, align 8
  %80 = load %union.header*, %union.header** %4, align 8
  %81 = bitcast %union.header* %80 to %struct.anon*
  %82 = getelementptr inbounds %struct.anon, %struct.anon* %81, i32 0, i32 0
  %83 = load %union.header*, %union.header** %82, align 8
  store %union.header* %83, %union.header** %4, align 8
  br label %22

84:                                               ; preds = %75, %62
  %85 = load i8*, i8** %2, align 8
  ret i8* %85
}

declare dso_local %union.header* @_Z8morecorej(i32) #1

; Function Attrs: noinline nounwind optnone uwtable
define dso_local void @_Z4freePv(i8* %0) #2 {
  %2 = alloca i8*, align 8
  %3 = alloca %union.header*, align 8
  %4 = alloca %union.header*, align 8
  store i8* %0, i8** %2, align 8
  %5 = load i8*, i8** %2, align 8
  %6 = bitcast i8* %5 to %union.header*
  %7 = getelementptr inbounds %union.header, %union.header* %6, i64 -1
  store %union.header* %7, %union.header** %3, align 8
  %8 = load %union.header*, %union.header** @_ZL5freep, align 8
  store %union.header* %8, %union.header** %4, align 8
  br label %9

9:                                                ; preds = %43, %1
  %10 = load %union.header*, %union.header** %3, align 8
  %11 = load %union.header*, %union.header** %4, align 8
  %12 = icmp ugt %union.header* %10, %11
  br i1 %12, label %13, label %20

13:                                               ; preds = %9
  %14 = load %union.header*, %union.header** %3, align 8
  %15 = load %union.header*, %union.header** %4, align 8
  %16 = bitcast %union.header* %15 to %struct.anon*
  %17 = getelementptr inbounds %struct.anon, %struct.anon* %16, i32 0, i32 0
  %18 = load %union.header*, %union.header** %17, align 8
  %19 = icmp ult %union.header* %14, %18
  br label %20

20:                                               ; preds = %13, %9
  %21 = phi i1 [ false, %9 ], [ %19, %13 ]
  %22 = xor i1 %21, true
  br i1 %22, label %23, label %48

23:                                               ; preds = %20
  %24 = load %union.header*, %union.header** %4, align 8
  %25 = load %union.header*, %union.header** %4, align 8
  %26 = bitcast %union.header* %25 to %struct.anon*
  %27 = getelementptr inbounds %struct.anon, %struct.anon* %26, i32 0, i32 0
  %28 = load %union.header*, %union.header** %27, align 8
  %29 = icmp uge %union.header* %24, %28
  br i1 %29, label %30, label %42

30:                                               ; preds = %23
  %31 = load %union.header*, %union.header** %3, align 8
  %32 = load %union.header*, %union.header** %4, align 8
  %33 = icmp ugt %union.header* %31, %32
  br i1 %33, label %41, label %34

34:                                               ; preds = %30
  %35 = load %union.header*, %union.header** %3, align 8
  %36 = load %union.header*, %union.header** %4, align 8
  %37 = bitcast %union.header* %36 to %struct.anon*
  %38 = getelementptr inbounds %struct.anon, %struct.anon* %37, i32 0, i32 0
  %39 = load %union.header*, %union.header** %38, align 8
  %40 = icmp ult %union.header* %35, %39
  br i1 %40, label %41, label %42

41:                                               ; preds = %34, %30
  br label %48

42:                                               ; preds = %34, %23
  br label %43

43:                                               ; preds = %42
  %44 = load %union.header*, %union.header** %4, align 8
  %45 = bitcast %union.header* %44 to %struct.anon*
  %46 = getelementptr inbounds %struct.anon, %struct.anon* %45, i32 0, i32 0
  %47 = load %union.header*, %union.header** %46, align 8
  store %union.header* %47, %union.header** %4, align 8
  br label %9

48:                                               ; preds = %41, %20
  %49 = load %union.header*, %union.header** %3, align 8
  %50 = load %union.header*, %union.header** %3, align 8
  %51 = bitcast %union.header* %50 to %struct.anon*
  %52 = getelementptr inbounds %struct.anon, %struct.anon* %51, i32 0, i32 1
  %53 = load i32, i32* %52, align 8
  %54 = zext i32 %53 to i64
  %55 = getelementptr inbounds %union.header, %union.header* %49, i64 %54
  %56 = load %union.header*, %union.header** %4, align 8
  %57 = bitcast %union.header* %56 to %struct.anon*
  %58 = getelementptr inbounds %struct.anon, %struct.anon* %57, i32 0, i32 0
  %59 = load %union.header*, %union.header** %58, align 8
  %60 = icmp eq %union.header* %55, %59
  br i1 %60, label %61, label %84

61:                                               ; preds = %48
  %62 = load %union.header*, %union.header** %4, align 8
  %63 = bitcast %union.header* %62 to %struct.anon*
  %64 = getelementptr inbounds %struct.anon, %struct.anon* %63, i32 0, i32 0
  %65 = load %union.header*, %union.header** %64, align 8
  %66 = bitcast %union.header* %65 to %struct.anon*
  %67 = getelementptr inbounds %struct.anon, %struct.anon* %66, i32 0, i32 1
  %68 = load i32, i32* %67, align 8
  %69 = load %union.header*, %union.header** %3, align 8
  %70 = bitcast %union.header* %69 to %struct.anon*
  %71 = getelementptr inbounds %struct.anon, %struct.anon* %70, i32 0, i32 1
  %72 = load i32, i32* %71, align 8
  %73 = add i32 %72, %68
  store i32 %73, i32* %71, align 8
  %74 = load %union.header*, %union.header** %4, align 8
  %75 = bitcast %union.header* %74 to %struct.anon*
  %76 = getelementptr inbounds %struct.anon, %struct.anon* %75, i32 0, i32 0
  %77 = load %union.header*, %union.header** %76, align 8
  %78 = bitcast %union.header* %77 to %struct.anon*
  %79 = getelementptr inbounds %struct.anon, %struct.anon* %78, i32 0, i32 0
  %80 = load %union.header*, %union.header** %79, align 8
  %81 = load %union.header*, %union.header** %3, align 8
  %82 = bitcast %union.header* %81 to %struct.anon*
  %83 = getelementptr inbounds %struct.anon, %struct.anon* %82, i32 0, i32 0
  store %union.header* %80, %union.header** %83, align 8
  br label %92

84:                                               ; preds = %48
  %85 = load %union.header*, %union.header** %4, align 8
  %86 = bitcast %union.header* %85 to %struct.anon*
  %87 = getelementptr inbounds %struct.anon, %struct.anon* %86, i32 0, i32 0
  %88 = load %union.header*, %union.header** %87, align 8
  %89 = load %union.header*, %union.header** %3, align 8
  %90 = bitcast %union.header* %89 to %struct.anon*
  %91 = getelementptr inbounds %struct.anon, %struct.anon* %90, i32 0, i32 0
  store %union.header* %88, %union.header** %91, align 8
  br label %92

92:                                               ; preds = %84, %61
  %93 = load %union.header*, %union.header** %4, align 8
  %94 = load %union.header*, %union.header** %4, align 8
  %95 = bitcast %union.header* %94 to %struct.anon*
  %96 = getelementptr inbounds %struct.anon, %struct.anon* %95, i32 0, i32 1
  %97 = load i32, i32* %96, align 8
  %98 = zext i32 %97 to i64
  %99 = getelementptr inbounds %union.header, %union.header* %93, i64 %98
  %100 = load %union.header*, %union.header** %3, align 8
  %101 = icmp eq %union.header* %99, %100
  br i1 %101, label %102, label %119

102:                                              ; preds = %92
  %103 = load %union.header*, %union.header** %3, align 8
  %104 = bitcast %union.header* %103 to %struct.anon*
  %105 = getelementptr inbounds %struct.anon, %struct.anon* %104, i32 0, i32 1
  %106 = load i32, i32* %105, align 8
  %107 = load %union.header*, %union.header** %4, align 8
  %108 = bitcast %union.header* %107 to %struct.anon*
  %109 = getelementptr inbounds %struct.anon, %struct.anon* %108, i32 0, i32 1
  %110 = load i32, i32* %109, align 8
  %111 = add i32 %110, %106
  store i32 %111, i32* %109, align 8
  %112 = load %union.header*, %union.header** %3, align 8
  %113 = bitcast %union.header* %112 to %struct.anon*
  %114 = getelementptr inbounds %struct.anon, %struct.anon* %113, i32 0, i32 0
  %115 = load %union.header*, %union.header** %114, align 8
  %116 = load %union.header*, %union.header** %4, align 8
  %117 = bitcast %union.header* %116 to %struct.anon*
  %118 = getelementptr inbounds %struct.anon, %struct.anon* %117, i32 0, i32 0
  store %union.header* %115, %union.header** %118, align 8
  br label %124

119:                                              ; preds = %92
  %120 = load %union.header*, %union.header** %3, align 8
  %121 = load %union.header*, %union.header** %4, align 8
  %122 = bitcast %union.header* %121 to %struct.anon*
  %123 = getelementptr inbounds %struct.anon, %struct.anon* %122, i32 0, i32 0
  store %union.header* %120, %union.header** %123, align 8
  br label %124

124:                                              ; preds = %119, %102
  %125 = load %union.header*, %union.header** %4, align 8
  store %union.header* %125, %union.header** @_ZL5freep, align 8
  ret void
}

attributes #0 = { noinline optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "min-legal-vector-width"="0" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #1 = { "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "no-infs-fp-math"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }
attributes #2 = { noinline nounwind optnone uwtable "correctly-rounded-divide-sqrt-fp-math"="false" "disable-tail-calls"="false" "frame-pointer"="all" "less-precise-fpmad"="false" "min-legal-vector-width"="0" "no-infs-fp-math"="false" "no-jump-tables"="false" "no-nans-fp-math"="false" "no-signed-zeros-fp-math"="false" "no-trapping-math"="false" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "unsafe-fp-math"="false" "use-soft-float"="false" }

!llvm.module.flags = !{!0}
!llvm.ident = !{!1}

!0 = !{i32 1, !"wchar_size", i32 4}
!1 = !{!"clang version 10.0.0-4ubuntu1 "}
