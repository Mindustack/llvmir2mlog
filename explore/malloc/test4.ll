; ModuleID = 'test4.cpp'
source_filename = "test4.cpp"
target datalayout = "e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-windows-msvc18.0.21005"
%struct.anon = type { ptr, i32 }
%union.header = type { %struct.anon }


@freep = internal unnamed_addr global ptr null, align 8
@base = internal global %union.header zeroinitializer, align 8
@heapcap = internal unnamed_addr global ptr null, align 8
@llvm.global_ctors = appending global [0 x { i32, ptr, ptr }] zeroinitializer

; Function Attrs: mustprogress nofree norecurse nosync nounwind uwtable
define dso_local void @"?Mfree@@YAXPEAX@Z"(ptr noundef %0) local_unnamed_addr #0 {
  %2 = getelementptr inbounds %union.header, ptr %0, i64 -1
  %3 = load ptr, ptr @freep, align 8, !tbaa !4
  br label %4

4:                                                ; preds = %10, %1
  %5 = phi ptr [ %3, %1 ], [ %7, %10 ]
  %6 = icmp ugt ptr %2, %5
  %7 = load ptr, ptr %5, align 8, !tbaa !4
  %8 = icmp ult ptr %2, %7
  %9 = select i1 %6, i1 %8, i1 false
  br i1 %9, label %15, label %10

10:                                               ; preds = %4
  %11 = icmp uge ptr %5, %7
  %12 = icmp ult ptr %2, %7
  %13 = select i1 %6, i1 true, i1 %12
  %14 = select i1 %11, i1 %13, i1 false
  br i1 %14, label %15, label %4, !llvm.loop !7

15:                                               ; preds = %4, %10
  %16 = getelementptr %union.header, ptr %0, i64 -1, i32 0, i32 1
  %17 = load i32, ptr %16, align 8, !tbaa !4
  %18 = zext i32 %17 to i64
  %19 = getelementptr inbounds %union.header, ptr %2, i64 %18
  %20 = icmp eq ptr %19, %7
  br i1 %20, label %21, label %27

21:                                               ; preds = %15
  %22 = getelementptr inbounds %struct.anon, ptr %7, i64 0, i32 1
  %23 = load i32, ptr %22, align 8, !tbaa !4
  %24 = add i32 %23, %17
  store i32 %24, ptr %16, align 8, !tbaa !4
  %25 = load ptr, ptr %5, align 8, !tbaa !4
  %26 = load ptr, ptr %25, align 8, !tbaa !4
  br label %27

27:                                               ; preds = %15, %21
  %28 = phi i32 [ %24, %21 ], [ %17, %15 ]
  %29 = phi ptr [ %26, %21 ], [ %7, %15 ]
  store ptr %29, ptr %2, align 8, !tbaa !4
  %30 = getelementptr inbounds %struct.anon, ptr %5, i64 0, i32 1
  %31 = load i32, ptr %30, align 8, !tbaa !4
  %32 = zext i32 %31 to i64
  %33 = getelementptr inbounds %union.header, ptr %5, i64 %32
  %34 = icmp eq ptr %33, %2
  br i1 %34, label %35, label %38

35:                                               ; preds = %27
  %36 = add i32 %28, %31
  store i32 %36, ptr %30, align 8, !tbaa !4
  %37 = load ptr, ptr %2, align 8, !tbaa !4
  br label %38

38:                                               ; preds = %27, %35
  %39 = phi ptr [ %37, %35 ], [ %2, %27 ]
  store ptr %39, ptr %5, align 8, !tbaa !4
  store ptr %5, ptr @freep, align 8, !tbaa !9
  ret void
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind uwtable
define dso_local noundef ptr @"?Mmalloc@@YAPEAXI@Z"(i32 noundef %0) local_unnamed_addr #0 {
  %2 = zext i32 %0 to i64
  %3 = add nuw nsw i64 %2, 15
  %4 = lshr i64 %3, 4
  %5 = trunc i64 %4 to i32
  %6 = add nuw nsw i32 %5, 1
  %7 = load ptr, ptr @freep, align 8, !tbaa !9
  %8 = icmp eq ptr %7, null
  br i1 %8, label %9, label %10

9:                                                ; preds = %1
  store ptr @base, ptr @freep, align 8, !tbaa !9
  store ptr @base, ptr @base, align 8, !tbaa !4
  store i32 0, ptr getelementptr inbounds (%union.header, ptr @base, i64 0, i32 0, i32 1), align 8, !tbaa !4
  br label %15

10:                                               ; preds = %1
  %11 = load ptr, ptr %7, align 8, !tbaa !4
  %12 = getelementptr inbounds %struct.anon, ptr %11, i64 0, i32 1
  %13 = load i32, ptr %12, align 8, !tbaa !4
  %14 = icmp ugt i32 %13, %5
  br i1 %14, label %20, label %15

15:                                               ; preds = %9, %10
  %16 = phi ptr [ @base, %9 ], [ %7, %10 ]
  %17 = phi ptr [ @base, %9 ], [ %11, %10 ]
  %18 = zext i32 %6 to i64
  %19 = shl nuw nsw i64 %18, 4
  br label %33

20:                                               ; preds = %77, %10
  %21 = phi ptr [ %11, %10 ], [ %80, %77 ]
  %22 = phi ptr [ %7, %10 ], [ %79, %77 ]
  %23 = phi i32 [ %13, %10 ], [ %82, %77 ]
  %24 = icmp eq i32 %23, %6
  br i1 %24, label %25, label %27

25:                                               ; preds = %20
  %26 = load ptr, ptr %21, align 8, !tbaa !4
  store ptr %26, ptr %22, align 8, !tbaa !4
  br label %84

27:                                               ; preds = %20
  %28 = getelementptr inbounds %struct.anon, ptr %21, i64 0, i32 1
  %29 = sub i32 %23, %6
  store i32 %29, ptr %28, align 8, !tbaa !4
  %30 = zext i32 %29 to i64
  %31 = getelementptr inbounds %union.header, ptr %21, i64 %30
  %32 = getelementptr inbounds %struct.anon, ptr %31, i64 0, i32 1
  store i32 %6, ptr %32, align 8, !tbaa !4
  br label %84

33:                                               ; preds = %15, %77
  %34 = phi ptr [ %16, %15 ], [ %78, %77 ]
  %35 = phi ptr [ %17, %15 ], [ %80, %77 ]
  %36 = icmp eq ptr %35, %34
  br i1 %36, label %37, label %77

37:                                               ; preds = %33
  %38 = load ptr, ptr @heapcap, align 8, !tbaa !9
  %39 = getelementptr inbounds %union.header, ptr %38, i64 %19
  store ptr %39, ptr @heapcap, align 8, !tbaa !9
  %40 = getelementptr inbounds %struct.anon, ptr %39, i64 0, i32 1
  store i32 %6, ptr %40, align 8, !tbaa !4
  %41 = getelementptr inbounds %union.header, ptr %39, i64 1
  %42 = getelementptr inbounds %union.header, ptr %41, i64 -1
  %43 = load ptr, ptr @freep, align 8, !tbaa !4
  br label %44

44:                                               ; preds = %50, %37
  %45 = phi ptr [ %43, %37 ], [ %47, %50 ]
  %46 = icmp ugt ptr %42, %45
  %47 = load ptr, ptr %45, align 8, !tbaa !4
  %48 = icmp ult ptr %42, %47
  %49 = select i1 %46, i1 %48, i1 false
  br i1 %49, label %54, label %50

50:                                               ; preds = %44
  %51 = icmp uge ptr %45, %47
  %52 = select i1 %46, i1 true, i1 %48
  %53 = select i1 %51, i1 %52, i1 false
  br i1 %53, label %54, label %44, !llvm.loop !7

54:                                               ; preds = %50, %44
  %55 = getelementptr inbounds %union.header, ptr %42, i64 %18
  %56 = icmp eq ptr %55, %47
  br i1 %56, label %57, label %64

57:                                               ; preds = %54
  %58 = getelementptr %union.header, ptr %41, i64 -1, i32 0, i32 1
  %59 = getelementptr inbounds %struct.anon, ptr %47, i64 0, i32 1
  %60 = load i32, ptr %59, align 8, !tbaa !4
  %61 = add i32 %60, %6
  store i32 %61, ptr %58, align 8, !tbaa !4
  %62 = load ptr, ptr %45, align 8, !tbaa !4
  %63 = load ptr, ptr %62, align 8, !tbaa !4
  br label %64

64:                                               ; preds = %57, %54
  %65 = phi i32 [ %61, %57 ], [ %6, %54 ]
  %66 = phi ptr [ %63, %57 ], [ %47, %54 ]
  store ptr %66, ptr %42, align 8, !tbaa !4
  %67 = getelementptr inbounds %struct.anon, ptr %45, i64 0, i32 1
  %68 = load i32, ptr %67, align 8, !tbaa !4
  %69 = zext i32 %68 to i64
  %70 = getelementptr inbounds %union.header, ptr %45, i64 %69
  %71 = icmp eq ptr %70, %42
  br i1 %71, label %72, label %75

72:                                               ; preds = %64
  %73 = add i32 %68, %65
  store i32 %73, ptr %67, align 8, !tbaa !4
  %74 = load ptr, ptr %42, align 8, !tbaa !4
  br label %75

75:                                               ; preds = %64, %72
  %76 = phi ptr [ %74, %72 ], [ %42, %64 ]
  store ptr %76, ptr %45, align 8, !tbaa !4
  store ptr %45, ptr @freep, align 8, !tbaa !9
  br label %77

77:                                               ; preds = %75, %33
  %78 = phi ptr [ %45, %75 ], [ %34, %33 ]
  %79 = phi ptr [ %45, %75 ], [ %35, %33 ]
  %80 = load ptr, ptr %79, align 8, !tbaa !4
  %81 = getelementptr inbounds %struct.anon, ptr %80, i64 0, i32 1
  %82 = load i32, ptr %81, align 8, !tbaa !4
  %83 = icmp ugt i32 %82, %5
  br i1 %83, label %20, label %33, !llvm.loop !11

84:                                               ; preds = %25, %27
  %85 = phi ptr [ %21, %25 ], [ %31, %27 ]
  store ptr %22, ptr @freep, align 8, !tbaa !9
  %86 = getelementptr inbounds %union.header, ptr %85, i64 1
  ret ptr %86
}

; Function Attrs: mustprogress nofree norecurse nosync nounwind uwtable
define dso_local noundef i32 @main() local_unnamed_addr #0 {
  %1 = load ptr, ptr @freep, align 8, !tbaa !9
  %2 = icmp eq ptr %1, null
  br i1 %2, label %3, label %7

3:                                                ; preds = %0
  store ptr @base, ptr @freep, align 8, !tbaa !9
  store ptr @base, ptr @base, align 8, !tbaa !4
  store i32 0, ptr getelementptr inbounds (%union.header, ptr @base, i64 0, i32 0, i32 1), align 8, !tbaa !4
  br label %4

4:                                                ; preds = %7, %3
  %5 = phi ptr [ %1, %7 ], [ @base, %3 ]
  %6 = phi ptr [ %8, %7 ], [ @base, %3 ]
  br label %25

7:                                                ; preds = %0
  %8 = load ptr, ptr %1, align 8, !tbaa !4
  %9 = getelementptr inbounds %struct.anon, ptr %8, i64 0, i32 1
  %10 = load i32, ptr %9, align 8, !tbaa !4
  %11 = icmp ugt i32 %10, 1
  br i1 %11, label %12, label %4

12:                                               ; preds = %65, %7
  %13 = phi ptr [ %8, %7 ], [ %68, %65 ]
  %14 = phi ptr [ %1, %7 ], [ %67, %65 ]
  %15 = phi i32 [ %10, %7 ], [ %70, %65 ]
  %16 = icmp eq i32 %15, 2
  br i1 %16, label %17, label %19

17:                                               ; preds = %12
  %18 = load ptr, ptr %13, align 8, !tbaa !4
  store ptr %18, ptr %14, align 8, !tbaa !4
  br label %72

19:                                               ; preds = %12
  %20 = getelementptr inbounds %struct.anon, ptr %13, i64 0, i32 1
  %21 = add i32 %15, -2
  store i32 %21, ptr %20, align 8, !tbaa !4
  %22 = zext i32 %21 to i64
  %23 = getelementptr inbounds %union.header, ptr %13, i64 %22
  %24 = getelementptr inbounds %struct.anon, ptr %23, i64 0, i32 1
  store i32 2, ptr %24, align 8, !tbaa !4
  br label %72

25:                                               ; preds = %4, %65
  %26 = phi ptr [ %66, %65 ], [ %5, %4 ]
  %27 = phi ptr [ %68, %65 ], [ %6, %4 ]
  %28 = icmp eq ptr %27, %26
  br i1 %28, label %29, label %65

29:                                               ; preds = %25
  %30 = load ptr, ptr @heapcap, align 8, !tbaa !9
  %31 = getelementptr inbounds %union.header, ptr %30, i64 32
  store ptr %31, ptr @heapcap, align 8, !tbaa !9
  %32 = getelementptr %union.header, ptr %30, i64 32, i32 0, i32 1
  store i32 2, ptr %32, align 8, !tbaa !4
  br label %33

33:                                               ; preds = %39, %29
  %34 = phi ptr [ %26, %29 ], [ %36, %39 ]
  %35 = icmp ugt ptr %31, %34
  %36 = load ptr, ptr %34, align 8, !tbaa !4
  %37 = icmp ult ptr %31, %36
  %38 = select i1 %35, i1 %37, i1 false
  br i1 %38, label %43, label %39

39:                                               ; preds = %33
  %40 = icmp uge ptr %34, %36
  %41 = select i1 %35, i1 true, i1 %37
  %42 = select i1 %40, i1 %41, i1 false
  br i1 %42, label %43, label %33, !llvm.loop !7

43:                                               ; preds = %39, %33
  %44 = getelementptr inbounds %union.header, ptr %30, i64 34
  %45 = icmp eq ptr %44, %36
  br i1 %45, label %46, label %52

46:                                               ; preds = %43
  %47 = getelementptr inbounds %struct.anon, ptr %36, i64 0, i32 1
  %48 = load i32, ptr %47, align 8, !tbaa !4
  %49 = add i32 %48, 2
  store i32 %49, ptr %32, align 8, !tbaa !4
  %50 = load ptr, ptr %34, align 8, !tbaa !4
  %51 = load ptr, ptr %50, align 8, !tbaa !4
  br label %52

52:                                               ; preds = %46, %43
  %53 = phi i32 [ %49, %46 ], [ 2, %43 ]
  %54 = phi ptr [ %51, %46 ], [ %36, %43 ]
  store ptr %54, ptr %31, align 8, !tbaa !4
  %55 = getelementptr inbounds %struct.anon, ptr %34, i64 0, i32 1
  %56 = load i32, ptr %55, align 8, !tbaa !4
  %57 = zext i32 %56 to i64
  %58 = getelementptr inbounds %union.header, ptr %34, i64 %57
  %59 = icmp eq ptr %58, %31
  br i1 %59, label %60, label %63

60:                                               ; preds = %52
  %61 = add i32 %56, %53
  store i32 %61, ptr %55, align 8, !tbaa !4
  %62 = load ptr, ptr %31, align 8, !tbaa !4
  br label %63

63:                                               ; preds = %60, %52
  %64 = phi ptr [ %62, %60 ], [ %31, %52 ]
  store ptr %64, ptr %34, align 8, !tbaa !4
  store ptr %34, ptr @freep, align 8, !tbaa !9
  br label %65

65:                                               ; preds = %63, %25
  %66 = phi ptr [ %34, %63 ], [ %26, %25 ]
  %67 = phi ptr [ %34, %63 ], [ %27, %25 ]
  %68 = load ptr, ptr %67, align 8, !tbaa !4
  %69 = getelementptr inbounds %struct.anon, ptr %68, i64 0, i32 1
  %70 = load i32, ptr %69, align 8, !tbaa !4
  %71 = icmp ugt i32 %70, 1
  br i1 %71, label %12, label %25, !llvm.loop !11

72:                                               ; preds = %17, %19
  %73 = phi ptr [ %13, %17 ], [ %23, %19 ]
  store ptr %14, ptr @freep, align 8, !tbaa !9
  %74 = getelementptr inbounds %union.header, ptr %73, i64 1
  %75 = ptrtoint ptr %74 to i64
  %76 = trunc i64 %75 to i32
  ret i32 %76
}

attributes #0 = { mustprogress nofree norecurse nosync nounwind uwtable "frame-pointer"="none" "min-legal-vector-width"="0" "no-trapping-math"="true" "stack-protector-buffer-size"="8" "target-cpu"="x86-64" "target-features"="+cx8,+fxsr,+mmx,+sse,+sse2,+x87" "tune-cpu"="generic" }

!llvm.module.flags = !{!0, !1, !2}
!llvm.ident = !{!3}

!0 = !{i32 1, !"wchar_size", i32 2}
!1 = !{i32 7, !"PIC Level", i32 2}
!2 = !{i32 7, !"uwtable", i32 2}
!3 = !{!"clang version 15.0.7"}
!4 = !{!5, !5, i64 0}
!5 = !{!"omnipotent char", !6, i64 0}
!6 = !{!"Simple C++ TBAA"}
!7 = distinct !{!7, !8}
!8 = !{!"llvm.loop.mustprogress"}
!9 = !{!10, !10, i64 0}
!10 = !{!"any pointer", !5, i64 0}
!11 = distinct !{!11, !8}
